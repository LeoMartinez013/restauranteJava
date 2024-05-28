/*
verifSenha()

var nome = $("#nome").val();
var senha = $("#senha").val();
var senhaRepetida = $("#senhaRepetida").val();

var usuario = {
    nome: nome,
    senha: senha,
    senhaRepetida: senhaRepetida
};

$.ajax({
    type: "POST",
    url: "/cadastro",
    data: JSON.stringify(usuario),
    contentType: "application/json",
    success: function(data) {
        console.log(data);
        alert("Usuario Cadastrado com Sucesso!"
        +"\nID: " + data.id + "\nNome: " + data.nome);
    },
    error: function(err) {
        console.log(err);
    }
});
*/
window.onload(() => {
    carregarCardapio()
    //  listarPedidosProntos()
})
async function adicionarPedido() {
    
}
async function adicionarItem() {
    
}
async function carregarCardapio() {
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
            console.log(error);
        }
    });
}

async function listarPedidosProntos() {

}