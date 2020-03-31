/**
 * 产品管理
 * 
 */
function NewGoodsType(){
	if(CheckTypeInfo()){
		$.ajax({
			contenType:'application/json',
			Type:'POST',
			dataType:'json',
			url:"../goods/savegoodstype.do",
			data:CreateGoodsTypeData(),
			success:function(data){
				if(data.code==200){
					layer.msg(data.msg);
					ResetGoodsType();
					reLoadData();
				}
			}
		})
	}
}
/**
 * 修改产品类型信息
 * @returns
 */
function UpdateGoodsType(){
	if(CheckTypeInfo()){
		$.ajax({
			contenType:'application/json',
			Type:'POST',
			dataType:'json',
			url:"../goods/savegoodstype.do",
			data:CreateGoodsTypeData(),
			success:function(data){
				if(data.code==200){
					layer.msg(data.msg);
					ResetGoodsType();
					reLoadData();
				}
			}
		})
	}
}
/**
 * 删除产品类型信息
 * @returns
 */
function DeleteGoodsType(){
	var delid=$("#goodstype-info #typeid").val();
	layer.confirm("是否删除产品类型:"+$("#goodstype-info #typename").val()+"?",{
		btn:["是","否"],
		btn1:function(){
			$.ajax({
				contenType:'application/json',
				Type:'POST',
				dataType:'json',
				url:"../goods/deletegoodstype.do",
				data:"delid="+delid,
				success:function(data){
					if(data.code==200){
						layer.msg(data.msg)
						ResetGoodsType();
						reLoadData();
					}else{
						layer.msg(data.msg)
					}
				}
			})			
		}
	})
}
function ResetGoodsType(){
	$("#goodstype-info #typeid").val("");
	$("#goodstype-info #ftype").val("");
	$("#goodstype-info #typename").val("");
	$("#goodstype-info #typeremarks").val("");
	InsertBtnState()
}
function CheckTypeInfo(){
	if($("#goodstype-info #typename").val()==""){
		layer.msg("类型名称不能为空!");
		return false;
	}
	return true;
}

/**
 * 点击获得类型信息
 * @param id
 * @param pid
 * @param typename
 * @param remarks
 * @returns
 */
function clickinfo(pid,id,typename,remarks){
	UpdateBtnState();
	$("#goodstype-info #ftype").val(pid);
	$("#goodstype-info #typeid").val(id);
	$("#goodstype-info #typename").val(typename);
	$("#goodstype-info #typeremarks").val(remarks);
}
/**
 * 
 * @returns
 */
function CreateGoodsTypeData(){
	var typeid=$("#goodstype-info #typeid").val();
	var parentid=$("#goodstype-info #ftype").val();
	var typename=$("#goodstype-info #typename").val();
	var remarks=$("#goodstype-info #typeremarks").val();
	return "typeid="+typeid+"&parentid="+parentid+"&typename="+typename+"&remarks="+remarks;
}
function Changestate(){
	$("#goodstype-info #ftype").val("-1");
	$("#goodstype-btn > .btn").attr('disabled', true);
}
function InsertBtnState(){
	Changestate();
	$("#goodstype-btn > #insert-btn").attr('disabled', false);
	$("#goodstype-btn > #reset-btn").attr('disabled', false);
}
function UpdateBtnState(){
	Changestate();
	$("#goodstype-btn > #update-btn").attr('disabled', false);
	$("#goodstype-btn > #delete-btn").attr('disabled', false);
	$("#goodstype-btn > #reset-btn").attr('disabled', false);
}
/**
 * 获取产品类型树
 * @returns
 */
function getGoodsTypeTree(e){
	$.ajax({
		contenType:'application/json',
		Type:'POST',
		dataType:'json',
		url:"../goods/getgoodstypetree.do",
		success:function(data){
			layui.use('tree', function(){
				layui.tree.render({
				elem: e,
				data:JSON.parse(data.typetree),
				click: function(obj){
					clickinfo(obj.data.parent,obj.data.id,obj.data.title,obj.data.remarks)
					}
				})
			})
		}
	})
}
/**
 * 获取父产品类型列表
 * @returns
 */
function getParentGoods(){
	$.ajax({
		contenType:'application/json',
		Type:'POST',
		dataType:'json',
		url:"../goods/goodstypeparent.do",
		success:function(data){
			$("#goodstype-info #ftype").empty();
			$("#goodstype-info #ftype").append("<option value='-1'>请选择……</option>")
			$.each(data.typelist,function(i,d){
				var innerHTML="<option value="+d.id+">"+d.typename+"</option>";
				$("#goodstype-info #ftype").append(innerHTML);
			})
		}
	})
}

function reLoadData(){
	getParentGoods();
	getGoodsTypeTree("#type-tree")
}