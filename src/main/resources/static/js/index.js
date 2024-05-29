const containerCardapio = document.getElementById('cardapio')
var itensPedido = []

window.onload = function() {
    //listarCardapio()
    
}
async function addItemPedido(id) {
    var checkbox = document.getElementById('checkItemCardapio' + 1)
    if(checkbox.checked) {
        checkbox.checked = false
    } else {
        checkbox.checked = true
    }
    console.log(checkbox.checked)
}
async function listarCardapio() {
    $.ajax({
        url: '/itens-cardapio',
        type: 'GET',
        success: function(data) {
            
            data.content.forEach(function(itemCardapio) {
                var button = $('<button/>', {
                    text: itemCardapio.nome,
                    id: 'itemCardapio' + itemCardapio.id,
                    class: 'itemCardapio'
                });
                $('#cardapio').append(button);
            });
        },
        error: function(error) {
            console.error(error);
        }
    });
}