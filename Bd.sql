CREATE TABLE Endereco (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    nome_rua VARCHAR(255),
    numero INT,
    cidade VARCHAR(255),
    estado VARCHAR(255)
);

CREATE TABLE Clientes (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    nome_da_empresa VARCHAR(255),
    CNPJ VARCHAR(20),
    email VARCHAR(255),
    telefone VARCHAR(20),
    id_endereco INT,
    FOREIGN KEY (id_endereco) REFERENCES Endereco(ID)
);


CREATE TABLE Funcionarios (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    telefone VARCHAR(20),
    tipo_de_trabalho VARCHAR(40),
    data_de_contratacao DATE,
    data_de_termino_do_contrato DATE,
    id_endereco INT,
    FOREIGN KEY (id_endereco) REFERENCES Endereco(ID)
);

CREATE TABLE Estoque (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    nome_material VARCHAR(255),
    quantidade INT,
    fornecedora VARCHAR(255),
    valor_base DECIMAL(10, 2),
    validade DATE,
    data_de_fabricacao DATE
);

CREATE TABLE Carrinho (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    id_estoque INT,
    id_cliente INT,
    FOREIGN KEY (id_estoque) REFERENCES Estoque(ID),
    FOREIGN KEY (id_cliente) REFERENCES Clientes(ID)
);

CREATE TABLE Pedidos (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    data_do_pedido DATE,
    horario_do_pedido TIME,
    nota_adicional TEXT,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(ID)
);

CREATE TABLE Vendas (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT,
    id_funcionario INT,
    valor_final DECIMAL(10, 2),
    entregue ENUM('Sim', 'Não'),
    data_de_entrega DATE,
    nota_adicional TEXT,
    FOREIGN KEY (id_pedido) REFERENCES Pedidos(ID),
    FOREIGN KEY (id_funcionario) REFERENCES Funcionarios(ID)
);



INSERT INTO Endereco (nome_rua, numero, cidade, estado) VALUES
('Rua Principal', 123, 'Cidade A', 'Estado A'),
('Avenida Secundária', 456, 'Cidade B', 'Estado B');

INSERT INTO Clientes (nome_da_empresa, CNPJ, email, telefone, id_endereco) VALUES
('Empresa X', '12345678901234', 'empresaX@email.com', '12345678', 1),
('Empresa Y', '56789012345678', 'empresaY@email.com', '87654321', 2);

INSERT INTO Funcionarios (nome, telefone, tipo_de_trabalho, data_de_contratacao, data_de_termino_do_contrato, id_endereco) VALUES
('João Silva', '99999999', 'Gerente', '2023-01-01', NULL, 1),
('Maria Santos', '88888888', 'Vendedor', '2023-02-01', '2024-12-31', 2);

INSERT INTO Estoque (nome_material, quantidade, fornecedora, valor_base, validade, data_de_fabricacao) VALUES
('Material A', 100, 'Fornecedor X', 50.00, '2025-01-01', '2024-01-01'),
('Material B', 200, 'Fornecedor Y', 30.00, '2024-12-31', '2024-01-01');

INSERT INTO Carrinho (id_estoque, id_cliente) VALUES
(1, 1),
(2, 2);

INSERT INTO Pedidos (id_cliente, data_do_pedido, horario_do_pedido, nota_adicional) VALUES
(1, '2024-05-26', '12:00:00', 'Entregar antes das 18h.'),
(2, '2024-05-26', '13:30:00', 'Favor embalar para presente.');

INSERT INTO Vendas (id_pedido, id_funcionario, valor_final, entregue, data_de_entrega, nota_adicional) VALUES
(1, 1, 100.00, 'Não', NULL, 'Cliente solicitou entrega rápida.'),
(2, 2, 150.00, 'Sim', '2024-05-26', NULL);
