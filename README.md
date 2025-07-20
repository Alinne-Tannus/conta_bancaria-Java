# 🏦 Sistema Bancário Simples em Java 💰

Projeto desenvolvido em Java que simula um sistema bancário básico. O usuário pode consultar saldo, receber valores e fazer transferências através de um menu interativo no console.

---

## 🖥 Tecnologias Utilizadas

- Java ☕  
- Utilização de `Scanner` para entrada de dados via console.

---

## 🚀 Como Rodar

1. Clone o repositório:
   ``` git clone https://github.com/Alinne-Tannus/conta_bancaria-Java ```

2.  Navegue até a pasta do projeto:
    ``` cd https://github.com/Alinne-Tannus/conta_bancaria-Java```

3.  Compile o arquivo Main.java:
   ```java Main```

🎯 Funcionalidades
-------------------

- Solicita nome, tipo de conta e saldo inicial do usuário.

- Menu interativo com as seguintes opções:

- Consultar saldo da conta.

- Receber valor (depósito).

- Transferir valor (saque).

- Sair do sistema.

- Validação para evitar transferência maior que o saldo disponível.

- Feedback ao usuário sobre operações realizadas.

 
 📋 Exemplo de Uso
 ----------------------
 ```yaml
Digite seu nome: Alinne
Digite seu tipo de conta: Corrente
Digite o saldo da conta: 1000

===================================
| Seja bem vindo(a) Alinne!
| Tipo de conta: Corrente
| Saldo da conta: R$1000.0
===================================

|| Digite a opção desejada:
 1 - Consultar saldo da conta
 2 - Receber valor
 3 - Transferir valor
 4 - Sair

> 1
O valor da conta é 1000.0

> 2
Digite o valor a ser recebido:
> 500
Valor transferido com sucesso!
Novo saldo: 1500.0

> 3
Digite valor a ser transferido:
> 2000
Valor insuficiente!

> 4
Programa finalizado.

```

📄 Licença
----------------

Projeto para fins educacionais.

Desenvolvido por Alinne Tannus 💻
