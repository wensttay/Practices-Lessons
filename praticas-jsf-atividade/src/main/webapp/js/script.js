/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$('.table-selectable > tbody > tr').click(function () {
    if ($(this).hasClass('active')) {
        $(this).removeClass('active');
    } else {
        $(".table-selectable > tbody > tr.active").removeClass('active');
        $(this).addClass('active');
    }

    if (($(".table-selectable > tbody > tr.active").length)) {
        $("#btn-editar").prop("disabled", false);
        $("#btn-deletar").prop("disabled", false);
        $("#btn-info").prop("disabled", false);
    } else {
        $("#btn-editar").prop("disabled", true);
        $("#btn-deletar").prop("disabled", true);
        $("#btn-info").prop("disabled", true);
    }

});