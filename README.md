# 🛡️ RPG em Java (Console)

Projeto de RPG baseado em turnos desenvolvido em **Java**, com foco em praticar conceitos fundamentais de programação orientada a objetos e lógica de sistemas.

---

## 🎯 Objetivo

Este projeto foi criado como forma de aprendizado prático durante os estudos de:

* Programação Orientada a Objetos (POO)
* Estruturas de dados
* Lógica de programação
* Organização de código em camadas

A ideia é evoluir o projeto gradualmente, aplicando novos conceitos conforme o aprendizado avança.

---

## ⚔️ Funcionalidades atuais

* Sistema de batalha por turnos
* Alternância automática entre jogadores
* Classes com comportamentos diferentes:

  * 🗡️ Guerreiro (ataque e defesa)
  * 🔮 Mago (magias, cura e gerenciamento de mana)
* Escolha de ações via terminal
* Escolha de alvo durante o turno
* Sistema básico de dano e defesa

---

## 🧠 Conceitos aplicados

* Encapsulamento (getters e setters)
* Herança (`extends`)
* Polimorfismo (`agir()`, `getAcoes()`)
* Separação em pacotes (`model`, `service`)
* Lógica de controle de fluxo (turnos e decisões)

---

## 📁 Estrutura do projeto

```
com.ragnarok
│
├── model
│   ├── Personagem.java
│   ├── Guerreiro.java
│   └── Mago.java
│
├── service
│   └── Batalha.java
│
└── Main.java
```

---

## ▶️ Como executar

1. Clone o repositório:

```
git clone https://github.com/MathN2/RPG-java.git
```

2. Abra o projeto em uma IDE Java (Eclipse recomendado)

3. Execute a classe `Main`

---

## 🚧 Próximos passos

* Sistema de criação de personagens
* Balanceamento de atributos
* Melhor validação de entradas
* Interface mais amigável (menu mais estruturado)
* Possível evolução para interface gráfica (JavaFX)

---

## 💡 Observações

Este projeto faz parte do meu processo de aprendizado.
A ideia não é ser perfeito, mas evoluir com o tempo.

---

👨‍💻 Autor: Matheus Novais 🫡
