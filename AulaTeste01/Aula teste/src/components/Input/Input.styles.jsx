import styled from "styled-components";

export const CheckboxInput = styled.input`
  margin: 0;
  padding: 0;
  width: 1.5rem;
  height: 1.5rem;
`;

export const CheckboxLabel = styled.label`
  display: flex;
  align-items: center;
  gap: 0.625rem;
  align-self: flex-start;
  color: ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#fefae0"};
  font-size: 1.5rem;
  font-style: normal;
  font-weight: 400;
  line-height: normal;
  cursor: pointer;
`;

export const InputGroup = styled.div`
  position: relative;
  display: flex;
  width: 100%;
  flex-direction: ${({ $type }) => ($type === "checkbox" ? "row" : "column")};
  align-items: flex-start;
  gap: 0.5rem;
`;

export const Label = styled.label`
  display: flex;
  align-items: flex-start;
  gap: 0.625rem;
  align-self: stretch;
  color: ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#fefae0"};
  font-size: 1rem;
  font-style: normal;
  font-weight: 400;
  line-height: normal;
`;

export const Input = styled.input`
  display: flex;
  padding: 0.5rem;
  align-items: flex-start;
  align-self: stretch;
  border-radius: 0.3125rem;
  font-size: 1rem;
  border: 1px solid
  ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#386fa4"};
color: ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#000"};
      width: 100%;
  height: 3rem;

  ${({ $type }) => $type === "checkbox" && "display: none;"}
`;

export const TextArea = styled.textarea`
  display: flex;
  padding: 0.5rem;
  align-items: flex-start;
  align-self: stretch;
  border-radius: 0.3125rem;
  border: 1px solid
  ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#386fa4"};
color: ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#000"};
  height: 6rem;
  overflow-y: auto;
`;

export const InputContainer = styled.div`
  position: relative;
  width: 100%;
`;

export const Icon = styled.button`
  position: absolute;
  top: 0.7rem;
  right: 0.7rem;
  cursor: pointer;
  background: transparent;
  border: 0;
  display: flex;
  align-items: center;
  justify-content: center;
  color: ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#386fa4"};
`;

export const ErrorSpan = styled.span`
  position: absolute;
  bottom: 0.2rem;
  left: 0.2rem;
  color: ${({ $color }) =>
    $color === "danger" ? "#d00000" :"#000"};
      font-size: 0.6rem;
  font-style: normal;
  font-weight: 600;
  line-height: normal;
`;
