document.getElementById('newsletterForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Impede o envio padrão do formulário

    // Obtenha o valor do e-mail do input
    var email = document.getElementById('emailInput').value;

    // Envie o e-mail para um servidor ou faça qualquer processamento adicional
    // Aqui, estamos apenas imprimindo o e-mail no console do navegador
    console.log('E-mail assinado:', email);

    // Limpe o campo de entrada de e-mail
    document.getElementById('emailInput').value = null;


    // Obtenha o valor do nome do input
    var name = document.getElementById('nameInput').value;

    // Envie o nome para um servidor ou faça qualquer processamento adicional
    // Aqui, estamos apenas imprimindo o nome no console do navegador
    console.log('Seu nome:', name);

    // Limpe o campo de entrada de nome
    document.getElementById('nameInput').value = null;

    // Obtenha o valor da data do input
    var datanasc = document.getElementById('dateInput').value;

    // Envie a data para um servidor ou faça qualquer processamento adicional
    // Aqui, estamos apenas imprimindo a data no console do navegador
    console.log('E-mail assinado:', datanasc);

    // Limpe o campo de entrada de e-mail
    document.getElementById('dateInput').value = null;

    

    // Exiba uma mensagem de sucesso
    alert('Obrigado por assinar a nossa newsletter!');
  });