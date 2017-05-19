$(function () {
    $('.radio').attr({"name":"sex","type":"radio","value":function(index,value){
        if (index == 0){
            return "female";
        }else{
            return "male";
        }
    }});
    $("#candy").click(function () {
        $("div").css('color','yellow');
        $("div > p").css('color','blue');
        $($("div").get(1)).css("color",'red');
        $('.box.pox').css("color",'red')
        // $('*').find('p').css('color','orange')
        // $('*').children('p').css('color','orange')
        $('div[id=demo]').children('p').css('color','orange')
        $('div').toggleClass(function (index,className,switchBool) {
                alert(index +':'+ className+','+ switchBool)
                return $(this).attr('id')=='demo'?'update_div_size':'';
        },count++ %3 ==0)
    });
    var count=0
    $('#rocky').click(function () {
        $('div').css('width',function (index,value) {
            return parseInt(value)-100+'px';
        })
        $('#submit').appendTo($('.box').next());
        $('.box').filter(':last').wrapInner(function () {
            var em=$(this)
            if(em.children('em').length > 0){
                em.find('strong').unwrap('em');
            }else{
                return '<em></em>';
            }
        });
    });
    var box=$('div').css(['width',]);
    // $.each(box,function (attr,value) {
    //     alert(attr+':'+value)
    // });
    // alert($(':input[type=radio]').size());
    $(':input[type=button]').button()
});
