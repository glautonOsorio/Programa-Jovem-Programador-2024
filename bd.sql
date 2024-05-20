CREATE TABLE Biblioteca (
    Cod INT PRIMARY KEY,
    Desc VARCHAR(255),
    End VARCHAR(255)
);

CREATE TABLE Associado (
    Mat INT PRIMARY KEY,
    Nome VARCHAR(255),
    Sexo CHAR(1)
);

CREATE TABLE Livro (
    ISBN VARCHAR(13) PRIMARY KEY,
    Titulo VARCHAR(255)
);

CREATE TABLE Assunto (
    Cod INT PRIMARY KEY,
    Desc VARCHAR(255)
);

CREATE TABLE Autor (
    Cod INT PRIMARY KEY,
    Nome VARCHAR(255)
);

CREATE TABLE Cadastro_Associado (
    BibliotecaCod INT,
    AssociadoMatricula INT,
    PRIMARY KEY (BibliotecaCod, AssociadoMatricula),
    FOREIGN KEY (BibliotecaCod) REFERENCES Biblioteca(Cod),
    FOREIGN KEY (AssociadoMatricula) REFERENCES Associado(Matricula)
);

CREATE TABLE Registro_Livros (
    BibliotecaCod INT,
    LivroISBN VARCHAR(13),
    PRIMARY KEY (BibliotecaCod, LivroISBN),
    FOREIGN KEY (BibliotecaCod) REFERENCES Biblioteca(Cod),
    FOREIGN KEY (LivroISBN) REFERENCES Livro(ISBN)
);

CREATE TABLE Associado_Livro (
    AssociadoMat INT,
    LivroISBN VARCHAR(13),
    PRIMARY KEY (AssociadoMat, LivroISBN),
    FOREIGN KEY (AssociadoMat) REFERENCES Associado(Mat),
    FOREIGN KEY (LivroISBN) REFERENCES Livro(ISBN)
);

CREATE TABLE Assuntos_Livro (
    LivroISBN VARCHAR(13),
    AssuntoCod INT,
    PRIMARY KEY (LivroISBN, AssuntoCod),
    FOREIGN KEY (LivroISBN) REFERENCES Livro(ISBN),
    FOREIGN KEY (AssuntoCod) REFERENCES Assunto(Cod)
);

CREATE TABLE Autores_Livro (
    LivroISBN VARCHAR(13),
    AutorCod INT,
    PRIMARY KEY (LivroISBN, AutorCod),
    FOREIGN KEY (LivroISBN) REFERENCES Livro(ISBN),
    FOREIGN KEY (AutorCod) REFERENCES Autor(Cod)
);
