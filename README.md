# 🎟️ Sistema de Bilheteria Virtual

Este projeto foi desenvolvido por **Cleidson Danilo** como uma aplicação Java simples e funcional para simular a compra de ingressos para eventos. Ele utiliza conceitos de orientação a objetos e está organizado em camadas para facilitar a manutenção e evolução do sistema.

---

## 📌 Objetivo

O sistema tem como propósito:

- Simular a compra de ingressos para eventos como shows e peças de teatro.
- Praticar e aplicar conceitos de **POO (Programação Orientada a Objetos)**.
- Demonstrar uma estrutura de projeto organizada com separação de responsabilidades.
- Servir como base para futuras melhorias como persistência de dados, interface gráfica e relatórios.

---

## 🗂️ Estrutura de Pastas

src/ ├── model/                  # Classes que representam os dados do sistema 
 │   ├── Cliente.java            # Representa o comprador
 │   ├── Evento.java             # Representa o evento disponível
 │   ├── Ingresso.java           # Representa o ingresso comprado
 │   └── Pagamento.java          # Simula o pagamento
 ├── service/                    # Lógica de negócio
 │   └── BilheteriaService.java  # Gerencia eventos e compras
 └── App.java                    # Ponto de entrada do programa

---

## 🚀 Como executar

1. Certifique-se de ter o **JDK 17 ou superior** instalado.
2. Compile os arquivos Java:

   ```Terminal
   javac App.java

   java App

## 🧠 Funcionalidades

- Listagem de eventos com data, preço e quantidade de ingressos disponíveis.
- Compra de ingresso com entrada de nome, e-mail e método de pagamento.
- Simulação de pagamento com recibo.
- Geração de QR Code textual para cada ingresso.
- Validação de entrada e controle de assentos.


## 📈 Próximos passos

• 	Persistência de dados em arquivos ou banco de dados.
• 	Interface gráfica com JavaFX ou Swing.
• 	Autenticação de cliente e histórico de compras.
• 	Relatórios de vendas e estatísticas administrativas.

## 👨‍💻 Autor

Cleidson Danilo T. Lopes

Desenvolvedor FullStack.

