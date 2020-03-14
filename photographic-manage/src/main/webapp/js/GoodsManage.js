/**
 * 产品管理
 * 
 */
function newGoodsType(obj){
	alert("!!!")
	changestate(obj)
}
function updateGoodsType(){
	
}
function deleteGoodsType(){
	
}
function resetGoodsType(){
	
}
function checkInfo(){
	
	return true;
}
function changestate(){
	$("#goodstype-btn > .btn").attr('disabled', true);
}
function InsertBtnState(){
	changestate();
	$("#goodstype-btn > #insert-btn").attr('disabled', false);
	$("#goodstype-btn > #reset-btn").attr('disabled', false);
}
function UpdateBtnState(){
	changestate();
	$("#goodstype-btn > #update-btn").attr('disabled', false);
	$("#goodstype-btn > #delete-btn").attr('disabled', false);
	$("#goodstype-btn > #reset-btn").attr('disabled', false);
}

function CheckData(){
	
}