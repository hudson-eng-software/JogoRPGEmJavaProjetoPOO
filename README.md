# 🎮 Jogo RPG em Java – Projeto POO Progresso: [█-------] 10%

![Java](https://img.shields.io/badge/Java-17-orange?logo=java) 
![POO](https://img.shields.io/badge/Paradigma-POO-blue) 
![Status](https://img.shields.io/badge/Status-Protótipo-green) 
![Contribuições](https://img.shields.io/badge/Contribuições-Bem%20vindo-brightgreen)

<img width="536" height="1024" alt="ChatGPT Image 6 de set  de 2025, 22_43_17" src="https://github.com/user-attachments/assets/16f54ed9-b059-4018-bef5-cb2764e7ed8c" />


## 📖 Visão Geral
Este projeto é um **jogo estilo RPG básico**, implementado em **Java** utilizando os princípios da **Programação Orientada a Objetos (POO)**.  

O objetivo é **educacional**: servir como ponto de partida para estudantes e desenvolvedores que queiram aprender a aplicar **encapsulamento, herança, polimorfismo e composição** de forma prática e divertida.  

---

## 🛠️ Funcionalidades
- ✅ **Sistema de Jogador e Inimigos** com vida, ataque e defesa.  
- ✅ **Mecânica de batalha** (combate por turnos).  
- ✅ **Inventário e Itens** (poções, armas, etc.).  
- ✅ **Navegação por mapa** (locais: Vila, Floresta, Masmorra).  
- ✅ **Estrutura extensível** para adicionar novos personagens, itens e mecânicas.  

---

## 📂 Estrutura do Projeto
````java
src/
└── game/
├── entities/
│ ├── Character.java # Classe abstrata para todos os personagens
│ ├── Player.java # Jogador controlado pelo usuário
│ ├── Enemy.java # Inimigos do jogo
│ └── Item.java # Itens (poções, armas, etc.)
│
├── mechanics/
│ ├── Battle.java # Sistema de combate
│ ├── Inventory.java # Inventário do jogador
│ └── Map.java # Locais do jogo
│
├── main/
│ └── Game.java # Classe principal (ponto de entrada)
│
└── utils/
└── InputHandler.java # Utilitários para entrada de dados (futuro)
````

---

## 📚 Principais Classes e Responsabilidades

### 🔹 `Character` (abstrata)
Classe base para todos os personagens do jogo.  
- Atributos: `name`, `health`, `attack`, `defense`  
- Métodos: `attack(Character target)`, `isAlive()`

---

### 🔹 `Player`
Representa o personagem controlado pelo jogador.  
- Possui um `Inventory`  
- Pode `attack()` e `useItem()`

<img width="236" height="1024" alt="ed80967e-4c2e-40a3-9544-9623fafae1a2" src="https://github.com/user-attachments/assets/34cf1436-596c-479a-bd7a-24bc6284ef65" />


---

### 🔹 `Enemy`
Representa inimigos controlados pelo computador.  
- Atacam o jogador em batalhas.  
- Herdam de `Character`.

<img width="236" height="1024" alt="d56c167f-8e2c-494d-bf8a-b66c2f130816" src="https://github.com/user-attachments/assets/2bb10f73-3fb8-4607-8587-425c0428b4bb" />


---

### 🔹 `Item`
Representa objetos utilizáveis (ex.: poções, armas).  
- Atributos: `name`, `type`, `power`  
- Método: `applyEffect(Player player)`

---

### 🔹 `Inventory`
Guarda os itens do jogador.  
- Métodos: `addItem(Item i)`, `showItems()`

---

### 🔹 `Battle`
Gerencia a lógica do combate em turnos.  
- Método: `fight(Player player, Enemy enemy)`

---

### 🔹 `Map`
Mostra os locais disponíveis e pode ser expandido para exploração.  

<img width="236" height="1024" alt="4ba0fe49-b587-47ea-b2c7-1327aa1ae46c" src="https://github.com/user-attachments/assets/41c29ef7-4382-4611-a0cd-5650d6a383dc" />


---

### 🔹 `Game`
Classe principal onde o jogo começa.  
- Inicializa jogador, inimigo, mapa e batalha.  

---

## 🚀 Como Executar

### 1. Clonar o repositório
```bash
git clone https://github.com/seu-usuario/java-rpg-game.git
cd java-rpg-game
````
2. Compilar
````java
javac src/game/main/Game.java
````
3. Executar
````java
java game.main.Game
````

---

## 📈 Como Contribuir

Faça um fork deste repositório

Adicione novas funcionalidades (novos inimigos, sistema de magia, missões, interface gráfica, etc.)

Envie um Pull Request

#

## 💡 Possíveis Extensões

🧙 Adicionar sistema de magia (feitiços, mana).

🗡️ Criar sistema de armas e armaduras equipáveis.

🌍 Expandir exploração do mapa com diferentes eventos.

👾 Criar múltiplos tipos de inimigos e chefes.

🖥️ Implementar uma Interface Gráfica (GUI) (Swing ou JavaFX).

---

### 📌 `Roadmap de Desenvolvimento`

- [x] Criar classes principais (Player, Enemy, Item, Inventory, Battle, Map).
- [x] Implementar sistema de batalha básico (ataque e defesa).
- [x] Criar inventário simples e uso de itens (ex.: poções).
- [ ] Adicionar múltiplos inimigos diferentes.
- [ ] Implementar sistema de magia (feitiços, mana, cura).
- [ ] Criar sistema de armas e armaduras equipáveis.
- [ ] Adicionar progressão do jogador (níveis, XP, habilidades).
- [ ] Expandir o mapa com eventos e locais adicionais.
- [ ] Criar interface gráfica (Swing ou JavaFX).
- [ ] Implementar sistema de missões/quests.

--- 
<p align="center">
  <h3> 👨‍💻Autor</h3> 
<h4> Hudson Amorim </h4>

  <img width="124" height="124" alt="fa604709-5f79-45a4-8816-37fb329a62ff" src="https://github.com/user-attachments/assets/088e310e-426f-40ad-a650-1cca0ed4e5eb" />
 
</p>
