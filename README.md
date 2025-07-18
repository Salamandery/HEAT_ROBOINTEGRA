# 🔄 HEAT_ROBOINTEGRA

<p align="center">
  <img src="https://img.shields.io/badge/Java-8+-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Swing-AWT-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Oracle-Database-F80000?style=for-the-badge&logo=oracle&logoColor=white"/>
  <img src="https://img.shields.io/badge/FTP-Protocol-FF6B35?style=for-the-badge&logo=filezilla&logoColor=white"/>
  <img src="https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white"/>
  <img src="https://img.shields.io/badge/Apache-Commons-FF6B35?style=for-the-badge&logo=apache&logoColor=white"/>
</p>

<div align="center">
  <b>🇧🇷 Português | <a href="#english-version">🇺🇸 English below</a></b>
</div>

---

## 📑 Sumário | Table of Contents
- [Sobre o Projeto | About](#sobre-o-projeto--about)
- [Tecnologias | Technologies](#tecnologias--technologies)
- [Estrutura | Structure](#estrutura--structure)
- [Instalação e Execução | Setup & Run](#instalação-e-execução--setup--run)
- [Funcionalidades | Features](#funcionalidades--features)
- [Autor | Author](#autor--author)

---

## Sobre o Projeto | About

**PT-BR:**
> Sistema de integração automatizada entre MV (Microsiga) e SYS, desenvolvido em Java Swing. O aplicativo roda em segundo plano no system tray, sincronizando dados de produtos, fornecedores e ordens de serviço entre os sistemas através de conexão Oracle e transferência FTP.

**EN:**
> Automated integration system between MV (Microsiga) and SYS, developed in Java Swing. The application runs in the background in the system tray, synchronizing product, supplier, and service order data between systems through Oracle connection and FTP transfer.

---

## 🚀 Tecnologias | Technologies

**PT-BR:**
- **Java 8+**: Linguagem principal do projeto
- **Java Swing/AWT**: Interface gráfica desktop
- **Oracle Database**: Banco de dados principal
- **Apache Commons Net**: Biblioteca para transferência FTP
- **NetBeans IDE**: Ambiente de desenvolvimento
- **System Tray**: Execução em segundo plano

**EN:**
- **Java 8+**: Main programming language
- **Java Swing/AWT**: Desktop GUI framework
- **Oracle Database**: Primary database
- **Apache Commons Net**: FTP transfer library
- **NetBeans IDE**: Development environment
- **System Tray**: Background execution

---

## 🗂️ Estrutura | Structure
```
HEAT_ROBOINTEGRA/
├── src/
│   └── robo_integra/
│       ├── Robo_integra.java          # Classe principal
│       ├── jFrmPrincipal.java         # Interface principal
│       ├── jFrmPrincipal.form         # Arquivo de design NetBeans
│       ├── dbConnect.java             # Conexão com banco de dados
│       └── cTableDAO.java             # Data Access Object
├── lib/
│   ├── ojdbc7.jar                     # Driver Oracle JDBC
│   └── commons-net-3.6.jar            # Biblioteca Apache Commons
├── build.xml                          # Script de build Ant
├── manifest.mf                        # Manifesto do JAR
└── README.md
```

---

## ⚙️ Instalação e Execução | Setup & Run

**PT-BR:**
1. **Pré-requisitos:** Java 8+ e NetBeans IDE
2. **Configure o banco de dados:**
   - Edite `dbConnect.java` com suas credenciais Oracle
   - Configure IP, porta e schema do banco
3. **Abra no NetBeans:**
   - Importe o projeto no NetBeans IDE
   - Configure as bibliotecas em `lib/`
4. **Execute o projeto:**
   - Clean and Build
   - Run Project
   - O aplicativo iniciará no system tray

**EN:**
1. **Prerequisites:** Java 8+ and NetBeans IDE
2. **Configure database:**
   - Edit `dbConnect.java` with your Oracle credentials
   - Configure IP, port, and database schema
3. **Open in NetBeans:**
   - Import the project in NetBeans IDE
   - Configure libraries in `lib/`
4. **Run the project:**
   - Clean and Build
   - Run Project
   - The application will start in system tray

---

## 🔧 Funcionalidades | Features

**PT-BR:**
- **Sincronização Automática**: Executa a cada 5 segundos
- **Integração de Dados**: Produtos, Fornecedores, Ordens de Serviço
- **System Tray**: Execução em segundo plano
- **Transferência FTP**: Envio automático de arquivos
- **Interface Gráfica**: Monitoramento em tempo real
- **Log de Erros**: Controle de erros e novos registros

**EN:**
- **Automatic Synchronization**: Runs every 5 seconds
- **Data Integration**: Products, Suppliers, Service Orders
- **System Tray**: Background execution
- **FTP Transfer**: Automatic file sending
- **Graphical Interface**: Real-time monitoring
- **Error Logging**: Error control and new records tracking

---

## 👨‍💻 Autor | Author

**PT-BR:**

<div align="center">

**Rodolfo M. F. Abreu**  
Desenvolvedor de software apaixonado por tecnologia, aprendizado contínuo e boas práticas de programação. Sempre em busca de novos desafios e oportunidades para colaborar em projetos inovadores.

[![GitHub](https://img.shields.io/badge/GitHub-rodolfomfabreu-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

Sinta-se à vontade para entrar em contato para dúvidas, sugestões ou colaborações!

</div>

**EN:**

<div align="center">

**Rodolfo M. F. Abreu**  
Software developer passionate about technology, continuous learning, and best programming practices. Always looking for new challenges and opportunities to collaborate on innovative projects.

[![GitHub](https://img.shields.io/badge/GitHub-rodolfomfabreu-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

Feel free to get in touch for questions, suggestions, or collaborations!

</div>

---

<div align="center">
  <b>Feito com 💙 para estudos de integração de sistemas, Java Swing e automação de processos.<br/>
  Made with 💙 for system integration studies, Java Swing and process automation.</b>
</div>

---

<div align="center" id="english-version">
  <b>🇺🇸 English version above | <a href="#top">🇧🇷 Versão em português acima</a></b>
</div>