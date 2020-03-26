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
				}
			}
		})
	}
}
function UpdateGoodsType(){
	
}
function DeleteGoodsType(){
	
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
	$("#goodstype-info #ftype").val(pid)
	$("#goodstype-info #typeid").val(id);
	$("#goodstype-info #typename").val(typename);
	$("#goodstype-info #typeremarks").val(remarks);
	UpdateBtnState();
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