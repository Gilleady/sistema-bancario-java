## README.md

# Sistema Bancário Simples

Este projeto é um sistema bancário simples implementado em Java, com o objetivo de demonstrar conceitos básicos de programação orientada a objetos.

## Funcionamento

O sistema consiste em:

- **Banco:** Uma classe que representa um banco com nome e uma lista de contas.
- **Cliente:** Uma classe que representa um cliente com nome.
- **Conta:** Uma classe abstrata que representa uma conta bancária, com atributos como agência, número, saldo e cliente. Implementa a interface IConta, definindo métodos para sacar, depositar, transferir e imprimir extrato.
- **ContaCorrente:** Uma classe que representa uma conta corrente, herdando da classe Conta.
- **ContaPoupança:** Uma classe que representa uma conta poupança, herdando da classe Conta.
- **IConta:** Uma interface que define os métodos básicos de uma conta bancária.

O sistema permite criar clientes, contas correntes e contas poupanças, realizar operações de depósito, saque e transferência entre contas, e imprimir extratos de cada conta.

## Execução

Para executar o sistema, basta compilar e executar a classe Main.java.