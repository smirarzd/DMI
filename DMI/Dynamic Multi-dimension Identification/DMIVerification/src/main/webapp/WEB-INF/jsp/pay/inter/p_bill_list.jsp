<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="ts" uri="/rights"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html lang="en">

<head>

<base href="<%=basePath%>">
	<!-- 下拉框 -->
	<link rel="stylesheet" href="static/ace/css/chosen.css" />
	<!-- jsp文件头和头部 -->
	<%@ include file="../../system/index/top.jsp"%>
	<!-- 日期框 -->
	<link rel="stylesheet" href="static/ace/css/datepicker.css" />
</head>

<body class="no-skin">
	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
							
							<form action="interInfo/billDetail.do" name="interForm" id="interForm" method="post">
							
							<input type="hidden" name="interId" id="interId" value="${pd.interId}">
							<input type="hidden" name="userId" id="userId" value="${pd.userId}">
							
							<div id="zhongxin" style="padding-top: 13px;">
								<table width="100%" style="border: 1px solid #dddddd; padding-bottom: 10px; margin-bottom:10px;">
									<tr height="30">
										<td width="14%" class='center'><a href="javascript:void(0);" style="text-decoration:none" onclick="queryData('interDetail');">接口数据详情</a></td>
										<td style="border-left:1px solid;border-left-color:#dddddd;" width="14%" class='center'><a href="javascript:void(0);" style="text-decoration:none" onclick="queryData('userDetail');">用户信息</a></td>
										<td style="border-left:1px solid;border-left-color:#dddddd;" width="14%" class='center'><a href="javascript:void(0);" style="text-decoration:none" onclick="queryData('resultDetail');">计算结果信息</a></td>
										<td style="border-left:1px solid;border-left-color:#dddddd;" width="14%" class='center'><a href="javascript:void(0);" style="text-decoration:none" onclick="queryData('fundDetail');">基金分段信息</a></td>
										<td style="border-left:1px solid;border-left-color:#dddddd;" width="14%" class='center'><a href="javascript:void(0);" style="text-decoration:none" onclick="queryData('feeDetail');">费用汇总信息</a></td>
										<td style="border-left:1px solid;border-left-color:#dddddd;" width="14%" class='center'><a href="javascript:void(0);" style="text-decoration:none" onclick="queryData('overDetail');">超限明细信息</a></td>
										<td style="border-left:1px solid;border-left-color:#dddddd;" width="14%" class='center' bgcolor="#F0F0F0">
											<a href="javascript:void(0);" style="text-decoration:none" onclick="queryData('billDetail');">
												<font size="2" color="#7B7B7B"><b>结算单据信息</b></font>
											</a>
										</td>
									</tr>
								</table>
							
								<!-- 列表  -->
								<table id="simple-table" width="100%" class="table table-striped table-bordered table-hover" style="margin-top:10px;">
									<thead>
										<tr>
											<th width="5%" class="center">序号</th>
											<th width="17%" class="center">单据号码</th>
											<th width="17%" class="center">科室代码</th>
											<th width="17%" class="center">科室名称</th>
											<th width="17%" class="center">医生编码</th>
											<th width="17%" class="center">收费明细条数</th>
											<th width="10%" class="center">操作</th>
										</tr>
									</thead>
									
									<tbody>
									<!-- 开始循环 -->	
										<c:choose>
											<c:when test="${not empty varList}">
												<c:forEach items="${varList}" var="billList" varStatus="vs">
													<tr>
														<td width="5%" class='center'>${vs.index+1}</td>
														<td width="17%" class="center">${billList.bill_no}</td>
														<td width="17%" class="center">${billList.code}</td>
														<td width="17%" class="center">${billList.name}</td>
														<td width="17%" class="center">${billList.doc_no}</td>
														<td width="17%" class="center">${billList.num}</td>
														
														<td width="10%" class="center">
															<div class="btn-group">
																<ts:rights code="col/goRule">
																	<a class="btn btn-xs btn-purple" title="查看收费项目" onclick="queryBillItem('${billList.id}');">查看收费项目</a>
																</ts:rights>
															</div>
														</td>
													</tr>
												</c:forEach>
											</c:when>
										
											<c:otherwise>
												<tr class="main_info">
													<td colspan="100" class="center">没有相关数据</td>
												</tr>
											</c:otherwise>
										</c:choose>
									</tbody>
								</table>
								
								<!-- 分页 -->
								<div class="page-header position-relative">
									<table style="width:100%;">
										<tr>
											<td style="vertical-align:top;">
												<div class="pagination" style="float: right;padding-top: 0px;margin-top: 0px;">${page.pageStr}</div>
											</td>
										</tr>
									</table>
								</div>
				
							</div>
							
							</form>
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
		</div>
		<!-- /.main-content -->
	</div>
	<!-- /.main-container -->
	<!-- basic scripts -->
	<!-- 页面底部js¨ -->
	<%@ include file="../../system/index/foot.jsp"%>
	<!-- ace scripts -->
	<script src="static/ace/js/ace/ace.js"></script>
	<!-- inline scripts related to this page -->
	<!-- 下拉框 -->
	<script src="static/ace/js/chosen.jquery.js"></script>
	<!-- 日期框 -->
	<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
	<!--提示框-->
	<script type="text/javascript" src="static/js/jquery.tips.js"></script>
</body>

<script type="text/javascript">
	$(top.hangge());
	
	$(document).ready(function(){
		
	});
	
	function queryData(item){
		interForm.action = "<%=basePath%>/interInfo/"+item+".do";
		interForm.submit();
	}
	
	function queryBillItem(itemId){
		top.jzts();
		var diag = new top.Dialog();
		diag.Drag = true;
		diag.Title = '收费项目';
		diag.URL = '<%=path%>/interInfo/billItemDetail.do?B_ID='+itemId;
		diag.Width = 1400;
		diag.Height = 600;
		diag.CancelEvent = function(){ //关闭事件
			if(diag.innerFrame.contentWindow.document.getElementById('zhongxin').style.display == 'none'){
				if('${page.currentPage}' == '0'){
					top.jzts();
					setTimeout("self.location=self.location",100);
				}else{
					nextPage(${page.currentPage});
				}
			}
			diag.close();
		};
		diag.show();
		
		//var url_path = "/interInfo/billItemDetail.do?B_ID="+itemId;
		//var attribute = "dialogWidth=1200px;dialogHeight=600px;status=no;help=no;scroll=yes;resizable=no;location=no;toolbar=no;menubar=no;titlebar=no";
		//window.showModalDialog(url_path, window, attribute);
	}
</script>

</html>