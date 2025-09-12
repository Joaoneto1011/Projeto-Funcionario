# 📊 Sistema de Gestão de Funcionários e Contratos por Hora em Java

Este projeto é um **sistema de gerenciamento de funcionários**, desenvolvido em **Java**, aplicando **Programação Orientada a Objetos (POO)**.  
O sistema permite cadastrar funcionários, departamentos, contratos por hora e calcular a renda mensal de cada trabalhador de forma precisa.

---

## 🚀 Funcionalidades

- Cadastro de **Departamentos**.  
- Cadastro de **Funcionários** com nome, nível (JUNIOR, PLENO, SENIOR) e salário base.  
- Registro de **Contratos por Hora** com data, valor por hora e duração em horas.  
- Cálculo da **renda mensal** de cada funcionário, somando salário base + contratos do mês.  
- Exibição de informações completas no terminal: nome, departamento e renda do mês informado.

---

### 🔹 Classes e Pacotes

- **Departamento** → Modela os departamentos da empresa.  
- **Funcionario** → Representa um funcionário, seus dados, contratos e cálculo de renda.  
- **ContratoPorHora** → Registra contratos adicionais com data, horas trabalhadas e valor por hora.  
- **NivelTrabalhador (enum)** → Define os níveis do funcionário: JUNIOR, PLENO, SENIOR.  
- **ProgramaPrincipal** → Classe principal que integra todas as funcionalidades e realiza entradas e saídas no terminal.

---

## ⚙️ Tecnologias e Conceitos Aplicados

- **Java SE 24**  
- **Programação Orientada a Objetos (POO)**  
- **Encapsulamento e associações entre classes**  
- **Enums e listas (`ArrayList`)**  
- **Manipulação de datas (`Date` e `Calendar`)**  
- **Cálculo de renda baseado em contratos mensais**  

---
💡 Exemplo de Execução

Entrada:

Departamento: TI

Funcionário: João Silva

Nível: PLENO

Salário Base: 3000.00

Quantidade de contratos: 2

---

Contrato 1:

Data: 15/09/2025

Valor por hora: 50.00

Horas: 10

---

Contrato 2:

Data: 20/09/2025

Valor por hora: 60.00

Horas: 5

---

Mês/Ano para cálculo da renda: 09/2025

---

Saída no Terminal:

Nome: João Silva

Departamento: TI

Renda para 09/2025: 3800.00

---

👨‍💻 Autor

João Neto

neto31510@gmail.com

(34) 99683-2626

https://www.linkedin.com/in/joao-rodrigues-neto-855757293

---
