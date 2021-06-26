//hàm xét Regex là controtor function
function    Validate(options) {
    //hàm thực hiện validate
    function validate1(inputElement, rule) {
        var errorMessage = rule.test(inputElement.value);
        var erroElement =inputElement.parentElement.querySelector('.form-message');

        if(errorMessage)
        {
            erroElement.innerText =errorMessage;
            inputElement.parentElement.classList.add('invalid');
        }
        else {
            erroElement.innerText =' ';
            inputElement.parentElement.classList.remove('invalid');

        }

    }

    // Lấy element của form cần validate
    var formElement = document.querySelector(options.form);
  //  console.log(options.rules)
    if(formElement)
    {
        options.rules.forEach(function (rule) {
           var inputElement = formElement.querySelector(rule.selector);
            // var erroElement =inputElement.parentElement.querySelector('.form-message');
           if(inputElement)
           {
               // xử lý trường hợponblur khi di chuyển chuột ra khỏi input
               inputElement.onblur= function () {
                   validate1(inputElement,rule);
               }
           //     xử lý trường hợp  oninput mỗi khi người nhập vào input
               inputElement.oninput = function () {
                   var erroElement =inputElement.parentElement.querySelector('.form-message');
                   erroElement.innerText =' ';
                   inputElement.parentElement.classList.remove('invalid');
               }
           }
        });
    }
}
//định nghĩa các rules
// nguyên tác của các rules
// 1. khi có lỗi trả lại message lỗi
//2. khi ko có lỗi không trả lại gì cả(undefined)
//value.trim()  loại bỏ khoảng cách 2 bên đầu chuỗi
Validate.isID = function (selector) {
    // return ra op zec gồm 2  key 1 là selector và 2 là test
    return {
        selector: selector,
        test: function (value) {
            return value.trim() ? undefined:'Vui lòng nhập trường này'
        }
    };

}
Validate.isTen = function (selector) {
    return {
        selector: selector,
        test: function () {


        }
    };
}

Validate.isEmail = function (selector) {
    return {
        selector: selector,
        test: function (value) {
            var email = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
            // return value.trim() ? undefined:'Vui lòng nhập trường này'
            return  email.test(value) ? undefined : 'Vui lòng nhập đúng định dang của email';
        }
    };
}