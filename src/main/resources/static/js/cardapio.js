window.onload = function() {
    //listarCardapio()
    
}
async function ListarCardapio() {
    $.ajax({
        url: '/api-cardapio',
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