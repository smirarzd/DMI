package com.models.cloud.pay.escrow.alipay.response;

public enum AliErrorMsg {
	
SUCCESS("0","成功"),
DOING("1000","处理中"),
PARAM_ERROR("1001","参数有误"),
ERROR("1002","非预期异常"),

VERFIY_FAIL("10001","未通过验签！"),
TRADE_NOT_FOUD("10002","查询不到该笔交易！"),

//---------------------系統错误码-------------------------------
SYSTEM_ERROR("SYSTEM_ERROR","支付宝系统错误"),
SESSION_TIMEOUT("SESSION_TIMEOUT","session超时"),
ILLEGAL_TARGET_SERVICE("ILLEGAL_TARGET_SERVICE","错误的target_service"),
ILLEGAL_ACCESS_SWITCH_SYSTEM("ILLEGAL_ACCESS_SWITCH_SYSTEM","partner不允许访问该类型的系统"),
ILLEGAL_SWITCH_SYSTEM("ILLEGAL_SWITCH_SYSTEM","切换系统异常"),
REFUND_ERROR("REFUND_ERROR ","退款失败（该错误码只会出现在系统异常时)"),
//---------------------单笔交易查询业务错误码-------------------------------
TRADE_NOT_EXIST("TRADE_NOT_EXIST","交易不存在,请检查提供的商户网站唯一订单号或者支付宝交易号是否正确"),
ILLEGAL_SIGN("ILLEGAL_SIGN","签名不正确"),
ILLEGAL_DYN_MD5_KEY("ILLEGAL_DYN_MD5_KEY","动态密钥信息错误"),
ILLEGAL_ENCRYPT("ILLEGAL_ENCRYPT","加密不正确"),
ILLEGAL_ARGUMENT("ILLEGAL_ARGUMENT","参数不正确"),
ILLEGAL_SERVICE("ILLEGAL_SERVICE","Service参数不正确"),
ILLEGAL_USER("ILLEGAL_USER","客户ID不正确"),
ILLEGAL_PARTNER("ILLEGAL_PARTNER","商户ID不正确"),
ILLEGAL_EXTERFACE("ILLEGAL_EXTERFACE","接口配置不正确"),
ILLEGAL_PARTNER_EXTERFACE("ILLEGAL_PARTNER_EXTERFACE","商户接口信息不正确"),
ILLEGAL_SECURITY_PROFILE("ILLEGAL_SECURITY_PROFILE","未找到匹配的密钥配置"),
ILLEGAL_AGENT("ILLEGAL_AGENT","代理ID不正确"),
ILLEGAL_SIGN_TYPE("ILLEGAL_SIGN_TYPE","签名类型不正确"),
ILLEGAL_CHARSET("ILLEGAL_CHARSET","字符集不合法"),
ILLEGAL_CLIENT_IP("ILLEGAL_CLIENT_IP","客户端IP地址无权访问服务"),
HAS_NO_PRIVILEGE("HAS_NO_PRIVILEGE","无权访问"),
ILLEGAL_DIGEST_TYPE("ILLEGAL_DIGEST_TYPE","摘要类型不正确"),
ILLEGAL_DIGEST("ILLEGAL_DIGEST","文件摘要不正确"),
ILLEGAL_FILE_FORMAT("ILLEGAL_FILE_FORMAT","文件格式不正确"),
ILLEGAL_ENCODING("ILLEGAL_ENCODING","不支持该编码类型"),
EXTERFACE_IS_CLOSED("EXTERFACE_IS_CLOSED","接口已关闭"),
ILLEGAL_REQUEST_REFERER("ILLEGAL_REQUEST_REFERER","防钓鱼检查不支持该请求来源"),
ILLEGAL_ANTI_PHISHING_KEY("ILLEGAL_ANTI_PHISHING_KEY","防钓鱼检查非法时间戳参数"),
ANTI_PHISHING_KEY_TIMEOUT("ANTI_PHISHING_KEY_TIMEOUT","防钓鱼检查时间戳超时"),
ILLEGAL_EXTER_INVOKE_IP("ILLEGAL_EXTER_INVOKE_IP","防钓鱼检查非法调用IP"),

//---------------------即时到账批量退款无密接口-------------------------------
BATCH_NUM_EXCEED_LIMIT("BATCH_NUM_EXCEED_LIMIT","总笔数大于1000"),
REFUND_DATE_ERROR("REFUND_DATE_ERROR","错误的退款时间"),
BATCH_NUM_ERROR("BATCH_NUM_ERROR","传入的总笔数格式错误"),
DUBL_ROYALTY_IN_DETAIL("DUBL_ROYALTY_IN_DETAIL","同一条明细中存在两条转入转出账户相同的分润信息"),
BATCH_NUM_NOT_EQUAL_TOTAL("BATCH_NUM_NOT_EQUAL_TOTAL","传入的退款条数不等于数据集解析出的退款条数"),
SINGLE_DETAIL_DATA_EXCEED_LIMIT("SINGLE_DETAIL_DATA_EXCEED_LIMIT","单笔退款明细超出限制"),
DUBL_TRADE_NO_IN_SAME_BATCH("DUBL_TRADE_NO_IN_SAME_BATCH","同一批退款中存在两条相同的退款记录"),
DUPLICATE_BATCH_NO("DUPLICATE_BATCH_NO","重复的批次号"),
TRADE_STATUS_ERROR("TRADE_STATUS_ERROR","交易状态不允许退款"),
BATCH_NO_FORMAT_ERROR("BATCH_NO_FORMAT_ERROR","批次号格式错误"),
PARTNER_NOT_SIGN_PROTOCOL("PARTNER_NOT_SIGN_PROTOCOL","平台商未签署协议"),
NOT_THIS_PARTNERS_TRADE("NOT_THIS_PARTNERS_TRADE","退款明细非本合作伙伴的交易"),
DETAIL_DATA_FORMAT_ERROR("DETAIL_DATA_FORMAT_ERROR","数据集参数格式错误"),
SELLER_NOT_SIGN_PROTOCOL("SELLER_NOT_SIGN_PROTOCOL","卖家未签署协议"),
INVALID_CHARACTER_SET("INVALID_CHARACTER_SET","字符集无效"),
ACCOUNT_NOT_EXISTS("ACCOUNT_NOT_EXISTS","账号不存在"),
EMAIL_USERID_NOT_MATCH("EMAIL_USERID_NOT_MATCH","Email和用户ID不匹配"),
REFUND_ROYALTY_FEE_ERROR("REFUND_ROYALTY_FEE_ERROR","退分润金额不合法"),
ROYALTYER_NOT_SIGN_PROTOCOL("ROYALTYER_NOT_SIGN_PROTOCOL","分润方未签署三方协议"),
RESULT_AMOUNT_NOT_VALID("RESULT_AMOUNT_NOT_VALID","退收费、退分润或者退款的金额错误"),
TRADE_NOT_EXISTS("TRADE_NOT_EXISTS","交易不存在"),
WHOLE_DETAIL_FORBID_REFUND("WHOLE_DETAIL_FORBID_REFUND","整条退款明细都禁止退款"),
TRADE_HAS_CLOSED("TRADE_HAS_CLOSED","交易已关闭,不允许退款"),
TRADE_HAS_FINISHED("TRADE_HAS_FINISHED","交易已结束,不允许退款"),
NO_REFUND_CHARGE_PRIVILEDGE("NO_REFUND_CHARGE_PRIVILEDGE","没有退收费的权限"),
RESULT_BATCH_NO_FORMAT_ERROR("RESULT_BATCH_NO_FORMAT_ERROR","批次号格式错误"),
BATCH_MEMO_LENGTH_EXCEED_LIMIT("BATCH_MEMO_LENGTH_EXCEED_LIMIT","备注长度超过256字节"),
REFUND_CHARGE_FEE_GREATER_THAN_LIMIT("REFUND_CHARGE_FEE_GREATER_THAN_LIMIT","退收费金额超过限制"),
REFUND_TRADE_FEE_ERROR("REFUND_TRADE_FEE_ERROR","退交易金额不合法"),
SELLER_STATUS_NOT_ALLOW("SELLER_STATUS_NOT_ALLOW","卖家状态不正常"),
SINGLE_DETAIL_DATA_ENCODING_NOT_SUPPORT("SINGLE_DETAIL_DATA_ENCODING_NOT_SUPPORT","单条数据集编码集不支持"),
TXN_RESULT_ACCOUNT_STATUS_NOT_VALID("TXN_RESULT_ACCOUNT_STATUS_NOT_VALID","卖家账户状态无效或被冻结"),
CA_USER_NOT_USE_CA("CA_USER_NOT_USE_CA","数字证书用户但未使用数字证书登录"),
BATCH_REFUND_LOCK_ERROR("BATCH_REFUND_LOCK_ERROR","同一时间不允许进行多笔并发退款"),
REFUND_SUBTRADE_FEE_ERROR("REFUND_SUBTRADE_FEE_ERROR","退子交易金额不合法"),
NANHANG_REFUND_CHARGE_AMOUNT_ERROR("NANHANG_REFUND_CHARGE_AMOUNT_ERROR","退票面价金额不合法"),
REFUND_AMOUNT_NOT_VALID("REFUND_AMOUNT_NOT_VALID","退款金额不合法"),
TRADE_PRODUCT_TYPE_NOT_ALLOW_REFUND("TRADE_PRODUCT_TYPE_NOT_ALLOW_REFUND","交易类型不允许退交易"),
RESULT_FACE_AMOUNT_NOT_VALID("RESULT_FACE_AMOUNT_NOT_VALID","退款票面价不能大于支付票面价"),
REFUND_CHARGE_FEE_ERROR("REFUND_CHARGE_FEE_ERROR","退收费金额不合法"),
REASON_REFUND_CHARGE_ERR("REASON_REFUND_CHARGE_ERR","退收费失败"),
DUP_ROYALTY_REFUND_ITEM("DUP_ROYALTY_REFUND_ITEM","重复的退分润条目"),
RESULT_ACCOUNT_NO_NOT_VALID("RESULT_ACCOUNT_NO_NOT_VALID","账号无效"),
REASON_REFUND_ROYALTY_ERROR("REASON_REFUND_ROYALTY_ERROR","退分润失败"),
REASON_TRADE_REFUND_FEE_ERR("REASON_TRADE_REFUND_FEE_ERR","退款金额错误"),
REASON_HAS_REFUND_FEE_NOT_MATCH("REASON_HAS_REFUND_FEE_NOT_MATCH","已退款金额错误"),
TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH("TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH","账户余额不足"),
REASON_REFUND_AMOUNT_LESS_THAN_COUPON_FEE("REASON_REFUND_AMOUNT_LESS_THAN_COUPON_FEE","红包无法部分退款"),
BATCH_REFUND_STATUS_ERROR("BATCH_REFUND_STATUS_ERROR","退款记录状态错误"),
BATCH_REFUND_DATA_ERROR("BATCH_REFUND_DATA_ERROR","批量退款后数据检查错误"),
REFUND_TRADE_FAILED("REFUND_TRADE_FAILED","不存在退交易,但是退收费和退分润失败"),
REFUND_FAIL("REFUND_FAIL","退款失败（该结果码只会出现在做意外数据恢复时,找不到结果码的情况)"),
SELLER_CONFLICT("SELLER_CONFLICT","因商户账户手机登录号被释放,暂无法收付款。为保障资金安全,建议修改账户名。"),
ROYALTY_RECEIVE_EMAIL_CONFLICT("ROYALTY_RECEIVE_EMAIL_CONFLICT","因分润收款账户手机登录号被释放,无法进行收付款。为了保障资金安全,建议修改账户名。"),
ROYALTY_PAY_EMAIL_CONFLICT("ROYALTY_PAY_EMAIL_CONFLICT","因分润付款账户手机登录号被释放,无法进行收付款。为了保障资金安全,建议修改账户名。"),
TRADE_PRODUCT_NOT_ALLOW_REFUND("TRADE_PRODUCT_NOT_ALLOW_REFUND","交易产品不允许退款"),
BUYER_ERROR("BUYER_ERROR","因买家支付宝账户问题不允许退款"),

//---------------------即时到账接口-------------------------------
SELLER_NOT_IN_SPECIFIED_SELLERS("SELLER_NOT_IN_SPECIFIED_SELLERS","抱歉,该收款账户不是指定的收款账户,请确认参数是否正确或咨询您的客户经理。"),
TRADE_SELLER_NOT_MATCH("TRADE_SELLER_NOT_MATCH","抱歉,该笔交易的卖家已不存在,请联系正确的卖家重新创建交易进行付款。"),
TRADE_BUYER_NOT_MATCH("TRADE_BUYER_NOT_MATCH","抱歉,您本次支付使用的账户与原先的不一致,请使用原来的账户,或重新创建交易付款。"),
ILLEGAL_FEE_PARAM("ILLEGAL_FEE_PARAM","抱歉,金额传递错误,请确认参数是否正确或咨询您的客户经理。"),
SUBJECT_MUST_NOT_BE_NULL("SUBJECT_MUST_NOT_BE_NULL","商品名不能为空。"),
TRADE_PRICE_NOT_MATCH("TRADE_PRICE_NOT_MATCH","抱歉,该商品的交易单价与原先的不一致,请重新创建交易付款。"),
TRADE_QUANTITY_NOT_MATCH("TRADE_QUANTITY_NOT_MATCH","抱歉,该商品的购买数量与原先的不一致,请重新创建交易付款。"),
TRADE_TOTALFEE_NOT_MATCH("TRADE_TOTALFEE_NOT_MATCH","抱歉,该商品的交易金额与原先的不一致,请重新创建交易付款。"),
TRADE_NOT_ALLOWED_PAY("TRADE_NOT_ALLOWED_PAY","抱歉,您不能进行本次支付,请查看该交易是否已超时或已被关闭等。"),
DIRECT_PAY_WITHOUT_CERT_CLOSE("DIRECT_PAY_WITHOUT_CERT_CLOSE","未开通非证书余额支付,无法完成支付。"),
FAIL_CREATE_CASHIER_PAY_ORDER("FAIL_CREATE_CASHIER_PAY_ORDER","抱歉,系统异常,无法创建本次收银台支付订单,请稍后再试。"),
ILLEGAL_EXTRA_COMMON_PARAM("ILLEGAL_EXTRA_COMMON_PARAM","抱歉,接口通用回传参数格式不正确,请联系您的商户。"),
ILLEGAL_PAYMENT_TYPE("ILLEGAL_PAYMENT_TYPE","抱歉,接口传递的Payment_type参数错误,请联系您的商户。"),
NOT_SUPPORT_GATEWAY("NOT_SUPPORT_GATEWAY","抱歉,商户网关配置出错,请联系您的商户。"),
BUYER_SELLER_EQUAL("BUYER_SELLER_EQUAL","抱歉,买家和卖家不能是同一个账户。"),
SELLER_NOT_EXIST("SELLER_NOT_EXIST","抱歉,卖家账户经验证不存在,请联系您的商户。"),
TRADE_NOT_FOUND("TRADE_NOT_FOUND","根据交易号无法找到交易。"),
TRADE_GOOD_INFO_NOT_FOUND("TRADE_GOOD_INFO_NOT_FOUND","根据交易号无法找到交易详情。"),
BUYER_EMAIL_ID_MUST_NULL("BUYER_EMAIL_ID_MUST_NULL","抱歉,该笔交易的买家账户必须为空,请联系您的商户。"),
PRODUCT_NOT_ALLOWED("PRODUCT_NOT_ALLOWED","您未开通此产品,暂时无法使用本服务。"),
ROYALTY_RECEIVER_NOT_IN_SPECIFIED_ACCOUNTS("ROYALTY_RECEIVER_NOT_IN_SPECIFIED_ACCOUNTS","抱歉,分润账号不是指定的分润账户,请确保该分润账户已签署分润协议。"),
ROYALTY_LENGTH_ERROR("ROYALTY_LENGTH_ERROR","抱歉,分润信息过长,不能超过1000个字符,请检查后重新集成。"),
DEFAULT_BANK_INVALID("DEFAULT_BANK_INVALID","您传递的默认网银参数不在规定的范围内。"),
DIS_NOT_SIGN_PROTOCOL("DIS_NOT_SIGN_PROTOCOL","抱歉,您的分销商没有与支付宝签约,请联系您的商户。"),
SELF_TIMEOUT_NOT_SUPPORT("SELF_TIMEOUT_NOT_SUPPORT","抱歉,商户没有开通自定义超时权限,请联系您的商户。"),
ILLEGAL_OUTTIME_ARGUMENT("ILLEGAL_OUTTIME_ARGUMENT","抱歉,自定义超时时间设置错误,请联系您的商户。"),
EBANK_CERDIT_GW_RULE_NOT_OPEN("EBANK_CERDIT_GW_RULE_NOT_OPEN","信用卡未签约（签约到期)或者接口参数未指定开通信用卡支付。"),
DIRECTIONAL_PAY_FORBIDDEN("DIRECTIONAL_PAY_FORBIDDEN","付款受限,请确保收款方有权进行收款。"),
SELLER_ENABLE_STATUS_FORBID("SELLER_ENABLE_STATUS_FORBID","卖家状态不正常。"),
ROYALTY_SELLER_ENABLE_STATUS_FORBID("ROYALTY_SELLER_ENABLE_STATUS_FORBID","抱歉,卖家暂时无法进行收款操作,请联系您的商户。"),
ROYALTY_SELLER_NOT_CERTIFY("ROYALTY_SELLER_NOT_CERTIFY","抱歉,卖家尚未通过认证,不能进行收款,请联系您的商户。"),
ROYALTY_FORAMT_ERROR("ROYALTY_FORAMT_ERROR","抱歉,接口传递的分润参数格式错误,请检查后重新集成。"),
ROYALTY_TYPE_ERROR("ROYALTY_TYPE_ERROR","抱歉,接口传递的分润类型错误,请检查后重新集成。"),
ROYALTY_RECEIVE_EMAIL_NOT_EXIST("ROYALTY_RECEIVE_EMAIL_NOT_EXIST","抱歉,分润账户经验证不存在,请联系您的商户。"),
ROYALTY_RECEIVE_EMAIL_NOT_CERTIFY("ROYALTY_RECEIVE_EMAIL_NOT_CERTIFY","抱歉,分润账户经验证未通过人行验证,请联系您的商户。"),
ROYALTY_PAY_EMAIL_NOT_EXIST("ROYALTY_PAY_EMAIL_NOT_EXIST","抱歉,分润付款账户经验证不存在,请联系您的商户。"),
TAOBAO_ANTI_PHISHING_CHECK_FAIL("TAOBAO_ANTI_PHISHING_CHECK_FAIL","抱歉,无法付款! 该笔交易可能存在风险,如果您确定本次交易没有问题,请1个小时后再付款。"),
SUBJECT_HAS_FORBIDDENWORD("SUBJECT_HAS_FORBIDDENWORD","抱歉,无法付款! 请联系商户修改商品名称,再重新购买。"),
PAY_CHECK_FAIL("PAY_CHECK_FAIL","抱歉,付款失败! 该笔交易可能存在风险。"),
BODY_HAS_FORBIDDENWORD("BODY_HAS_FORBIDDENWORD","抱歉,无法付款! 请联系商户修改商品描述,再重新购买。"),
NEED_CTU_CHECK_PARAMETER_ERROR("NEED_CTU_CHECK_PARAMETER_ERROR","抱歉,您传递的商户可信任参数权限参数错误。"),
NEED_CTU_CHECK_NOT_ALLOWED("NEED_CTU_CHECK_NOT_ALLOWED","抱歉,商户没有可信任参数校验的权限。"),
BUYER_NOT_EXIST("BUYER_NOT_EXIST","抱歉,买家账户经验证不存在。")

;

	private AliErrorMsg(String error_code, String msg) {
		this.error_code = error_code;
		this.msg = msg;
	}
	
	public static AliErrorMsg getAliErr(String error_code){
		return AliErrorMsg.valueOf(error_code);
	}

	private String error_code;
	private String msg;

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
