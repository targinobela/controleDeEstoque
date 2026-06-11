# 🏪 Gestão Loja

Sistema de gestão integrada para pequenos comércios desenvolvido em **Java + JavaFX** — controle de estoque, registro de vendas e gerenciamento de equipe em um só lugar.

---

## 📋 Sobre o Projeto

Mini-ERP desktop para pequenas lojas, cobrindo desde o controle de produtos até o registro de vendas por funcionário. Conta com perfis de acesso diferenciados e armazenamento local — sem necessidade de internet ou instalação de servidores.

---

## ✨ Funcionalidades

**Estoque**
- [x] Cadastrar produtos
- [x] Listar produtos
- [x] Buscar produto por ID
- [x] Atualizar produto por ID
- [x] Deletar produto por ID
- [ ] Alertas de estoque baixo *(em breve)*

**Vendas e Clientes**
- [ ] Cadastrar clientes *(em breve)*
- [ ] Registrar venda vinculada ao vendedor e ao cliente *(em breve)*
- [ ] Baixa automática no estoque ao registrar venda *(em breve)*

**Usuários e Permissões**
- [ ] Login com usuário e senha *(em breve)*
- [ ] Perfil **Admin** — acesso total, visualiza relatórios e números por vendedor *(em breve)*
- [ ] Perfil **Vendedor** — cadastra vendas e clientes *(em breve)*

**Interface e Dados**
- [ ] Interface gráfica com JavaFX *(em desenvolvimento)*
- [ ] Persistência de dados com SQLite *(em desenvolvimento)*

---

## 🗂️ Estrutura do Projeto

```
gestaoLoja/
├── entity/
│   ├── Produto.java            # Atributos do produto
│   ├── Venda.java              # Registro de venda (em breve)
│   ├── Cliente.java            # Dados do cliente (em breve)
│   └── Usuario.java            # Perfil de acesso (em breve)
├── enums/
│   ├── PerfilUsuario.java      # ADMIN, VENDEDOR (em breve)
│   └── ...                     # Outras enumerações
├── repository/
│   ├── ProdutoRepository.java  # CRUD de produtos
│   ├── VendaRepository.java    # CRUD de vendas (em breve)
│   └── UsuarioRepository.java  # CRUD de usuários (em breve)
└── service/
    └── AuthService.java        # Login e controle de permissões (em breve)
```

---

## 👤 Perfis de Acesso

| Perfil | Permissões |
|---|---|
| **Admin** | Acesso total ao sistema, gerencia usuários, visualiza relatórios e desempenho por vendedor |
| **Vendedor** | Cadastra vendas e clientes, consulta estoque |

---

## 🛠️ Tecnologias

| Tecnologia | Uso |
|---|---|
| Java 17+ | Linguagem principal |
| JavaFX | Interface gráfica *(em breve)* |
| SQLite | Banco de dados local *(em breve)* |

---

## 🗄️ Sobre o Armazenamento de Dados

O sistema utilizará **SQLite** como banco de dados — uma solução embutida que salva todos os dados em um único arquivo `.db` na própria máquina do usuário.

**Não é necessário instalar nenhum banco de dados externo.** O arquivo será criado automaticamente na primeira execução:

```
C:\Users\<usuario>\AppData\Local\GestaoLoja\dados.db
```

---

## 🚀 Como Executar

> ⚠️ *Instruções completas serão adicionadas após a integração com JavaFX e SQLite.*

**Pré-requisitos:**
- Java 17 ou superior instalado
- *(em breve)* JavaFX SDK

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/gestao-loja.git

# Navegue até a pasta do projeto
cd gestao-loja

# Compile e execute
javac -d bin src/**/*.java
java -cp bin gestaoLoja.Main
```

---

## 📌 Roadmap

- [ ] Interface gráfica com JavaFX
- [ ] Persistência com SQLite
- [ ] Sistema de login e perfis de acesso
- [ ] Cadastro de clientes e vendas
- [ ] Baixa automática no estoque ao vender
- [ ] Dashboard do admin com números por vendedor
- [ ] Alertas de estoque baixo
- [ ] Relatório de vendas por período

---

## 👨‍💻 Autor

Desenvolvido com ☕ para facilitar a vida de pequenos comerciantes.
