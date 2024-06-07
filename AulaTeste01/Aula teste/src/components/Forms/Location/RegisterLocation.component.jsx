import { useForm } from "react-hook-form";
import "react-toastify/dist/ReactToastify.css";
import { useContext, useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";


import * as Styled from "../Form.styles.jsx";
import { InputComponent } from "../../Input/Input.component.jsx";
import { ButtonComponent } from "../../Button/Button.component.jsx";

export const RegisterLocationComponent = () => {
  const { id } = useParams();

  const {
    register,
    handleSubmit,
    setValue,
    getValues,
    formState: { errors },
  } = useForm();

  
  const [media, setMedia] = useState(0);

  const calculateMedia = () => {
    const values = getValues(['nota1', 'nota2', 'nota3', 'nota4']);
    const notas = Object.values(values).map(parseFloat);
    const total = notas.reduce((acc, nota) => acc + nota, 0);
    const average = total / notas.length || 0;
    setMedia(average.toFixed(2));
    setValue("media",media)
    if (media >= 7.0) {
      setValue("situacao","Aprovado")

    }else if(media < 5){
      setValue("situacao","Reprovado")

    }else{
      setValue("situacao","Recuperação")

    }
  };

  const submitForm = (data) => {
    console.log(data);
  };

  return (
    <>
      <Styled.Form onSubmit={handleSubmit(submitForm)}>
        <Styled.FormColumn>
          <InputComponent
            id="matricula"
            name="matricula"
            type="text"
            placeholder="Digite a matrícula"
            label="Matrícula"
            register={register("matricula", {
              
            })}
            
            error={!!errors.matricula}
            errorMessage={errors.matricula?.message}
          />
          <InputComponent
            id="nome"
            name="nome"
            type="text"
            placeholder="Digite o nome do aluno"
            label="Nome do Aluno"
            register={register("nome", {
              required: "Campo obrigatório",
              maxLength: {
                value: 64,
                message: "Campo precisa ter menos de 64 caracteres",
              },
            })}
            error={!!errors.nome}
            errorMessage={errors.nome?.message}
          />
          <Styled.FormRow>
            <InputComponent
              id="nota1"
              name="nota1"
              type="text"
              placeholder="Digite a nota 1"
              label="Nota 1"
              register={register("nota1", {
                required: "Campo obrigatório",
                onBlur: () =>calculateMedia(),
                pattern: {
                  value: /^(10(\.0{1,2})?|\d(\.\d{1,2})?)$/,
                  message: " Maximum two decimal places allowed.",
                },
               
                })}
              error={!!errors.nota1}
              errorMessage={errors.nota1?.message}
            />
            <InputComponent
              id="nota2"
              name="nota2"
              type="text"
              placeholder="Digite a nota 2"
              label="Nota 2"
              register={register("nota2", {
                required: "Campo obrigatório",
                onBlur: () =>calculateMedia(),
                pattern: {
                  value: /^(10(\.0{1,2})?|\d(\.\d{1,2})?)$/,
                  message: " Maximum two decimal places allowed.",
                },
              
                })}
              error={!!errors.nota2}
              errorMessage={errors.nota2?.message}
            />
            <InputComponent
              id="nota3"
              name="nota3"
              type="text"
              placeholder="Digite a nota 3"
              label="Nota 3"
              register={register("nota3", {
                required: "Campo obrigatório",
                onBlur: () =>calculateMedia(),
                pattern: {
                  value: /^(10(\.0{1,2})?|\d(\.\d{1,2})?)$/,
                  message: " Maximum two decimal places allowed.",
                },
               
                })}
              error={!!errors.nota3}
              errorMessage={errors.nota3?.message}
            />
            <InputComponent
              id="nota4"
              name="nota4"
              type="text"
              placeholder="Digite a nota 4"
              label="Nota 4"
              register={register("nota4", {
                required: "Campo obrigatório",
                onBlur: () =>calculateMedia(),
                pattern: {
                  value: /^(10(\.0{1,2})?|\d(\.\d{1,2})?)$/,
                  message: "Máximo de duas casas decimais permitidas.",
                },
               

              })}
              error={!!errors.nota4}
              errorMessage={
                errors.nota4?.message ||
                (errors.nota4?.type === "isInRange" &&
                  "A nota precisa ser entre 0 e 10.")
              }
            />
          </Styled.FormRow>
          <Styled.FormRow>
            <InputComponent
              id="media"
              name="media"
              type="text"
              placeholder="Digite a média"
              label="Média"
              register={register("media", {
                required: "Campo obrigatório",

                pattern: {
                  value: /^(10(\.0{1,2})?|\d(\.\d{1,2})?)$/,
                  message: " Maximum two decimal places allowed.",
                },
                
              })}
              value={media}
              readOnly={true}
              error={!!errors.media}
              errorMessage={errors.media?.message}
            />
            <InputComponent
              id="situacao"
              name="situacao"
              type="text"
              placeholder="Digite a situação"
              label="Situação"
              register={register("situacao", {
                required: "Campo obrigatório",
                maxLength: {
                  value: 64,
                  message: "Campo precisa ter menos de 64 caracteres",
                },
              })}
              
              error={!!errors.situacao}
              errorMessage={errors.situacao?.message}
            />
          </Styled.FormRow>
        </Styled.FormColumn>
        <Styled.ButtonWrapper>
          <ButtonComponent
            type={"submit"}
            text={"Adicionar"}
            preset={"adicionar"}
            variant={"outlined"}
          />
        </Styled.ButtonWrapper>
      </Styled.Form>
    </>
  );
};
