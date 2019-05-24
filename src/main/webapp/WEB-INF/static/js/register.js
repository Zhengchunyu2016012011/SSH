/*
     账号：6~10位字母、数字、下划线，第一个字符必须是字母
         /^[a-zA-Z][\w]{5,9}$/
     密码：6~10位数字
         /^[\d]{6,10}$/
 * */
//验证用户名
function checkUsername(id, infoId){
    var reg = /^[a-zA-Z][\w]{5,9}$/;
    var txtUsername= document.getElementById(id).value;
    if(!reg.test(txtUsername)){
        setInfo(infoId,'用户名必须为6-10位字母数字，第一位是字母');
        return false;
    }
    return true;
}

//设置提示信息
function setInfo(id, info){
    document.getElementById(id).innerText=info;
}

//验证密码
function checkPassword(id, infoId) {
    var reg = /^[\d]{6,10}$/;
    var txtPassword = document.getElementById(id).value;
    if(!reg.test(txtPassword)) {
        setInfo(infoId,'密码必须为6~10位数字');
        return false;
    }
    return true;
}
//重复密码
function checkPasswordAgain(pwd1, pwd2, infoId){
    var txtPwd1 = document.getElementById(pwd1).value;
    var txtPwd2 = document.getElementById(pwd2).value;
    if(txtPwd1!= txtPwd2){
        setInfo(infoId, "与密码完全一致");
        return false;
    }
    var reg = /^[0-9]{6,10}$/;
    if(!reg.test(txtPwd2)) {
        setInfo(infoId,'密码必须为6~10位数字');
        return false;
    }
    return true;
}


//电子邮箱
function checkEmail(id, infoId) {
    var reg = /^[\w!#$%&'*+/=?^_`{|}~-]+(?:\.[\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\w](?:[\w-]*[\w])?\.)+[\w](?:[\w-]*[\w])?$/;
    var txtEmail = document.getElementById(id).value;
    if(!reg.test(txtEmail)) {
        setInfo(infoId, '请输入正确邮箱地址');
        return false;
    }
    return true;
}

//电话号码
function checkTel(id, infoId) {
    var reg = /^[1][0-9]{10}$/;
    var txtTel = document.getElementById(id).value;
    if(!reg.test(txtTel)) {
        setInfo(infoId,'请输入正确手机号');
        return false;
    }
    return true;
}



//清除信息
function clearInfo(id) {
    document.getElementById(id).innerText=" ";
}

//校验所有表单元素的内容
function checkAll() {
    if(checkUsername('username','usernameInfo')&checkPassword('pass', 'passwordInfo')&checkPasswordAgain('pass', 'passwordAgain', 'passwordAgainInfo')&checkEmail('email', 'emailInfo')&checkTel('tel', 'telInfo')&checkQq('qq', 'qqInfo')) {
        return true;
    }
    return false;
}