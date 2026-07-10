# 💳 Simulador de Cartão de Crédito

Simulador de **Cartão de Crédito** simples. Simula o funcionamento básico de um cartão de crédito: definição de limite, registro de compras, validação de saldo e extrato final ordenado por valor.

## 🧠 Conhecimentos utilizados
- Java (POO)
- Listas e Coleções (`List`, `LinkedList`)
- Interface `Comparable` para ordenação customizada
- Encapsulamento (atributos privados + getters)
- Entrada de dados via `Scanner`

## 📁 Estrutura do projeto
```
src/Lista/
├── Main.java   # Fluxo principal do programa (interação com o usuário)
├── prod.java   # Representa o cartão: limite, saldo e lista de compras
└── Compra.java # Representa uma compra: descrição, valor e comparação por valor
```

## 📋 Funcionalidades
- Define o limite do cartão
- Registra compras (descrição + valor)
- Valida o saldo disponível antes de aprovar cada compra
- Deduz o valor do saldo a cada compra aprovada
- Encerra automaticamente o loop se o saldo for insuficiente
- Ao final, exibe todas as compras realizadas **ordenadas por valor** (menor para maior)
- Exibe o saldo restante do cartão

## ▶️ Como executar

**Pelo Eclipse / IntelliJ:**
1. Clone o repositório:
   ```bash
   git clone https://github.com/FlytrZz/ProjetoFinaldeListaseCole-esJava_cursoalura.git
   ```
2. Importe o projeto na sua IDE
3. Execute a classe `Main.java`

**Pelo terminal:**
```bash
cd src
javac Lista/*.java
java Lista.Main
```

## 🖥️ Exemplo de uso
```
Digite o limite do cartão:
1000
Digite a descrição da compra:
Tênis
Digite o valor da compra:
250
Compra realizada!
Digite 0 para sair ou 1 para continuar
0
*********************
COMPRAS REALIZADAS:

Tênis - 250.0

*********************

Saldo do cartão: 750.0
```

## 📚 Aprendizados
Este projeto foi minha primeira aplicação prática de **listas** para armazenar objetos de um mesmo tipo (`Compra`) e de como implementar `Comparable` para permitir a ordenação automática dessa lista com `Collections.sort()`. Também reforcei conceitos de encapsulamento, separando bem a responsabilidade de cada classe (`prod` cuida do cartão, `Compra` representa o dado, `Main` cuida da interação com o usuário).

---
Feito por [FlytrZz](https://github.com/FlytrZz) 🚀
