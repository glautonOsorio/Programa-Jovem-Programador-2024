import * as Styled from "./Button.styles";

export const ButtonComponent = ({
  variant,
  type,
  disabled,
  onClick,
  preset,
  text,
}) => {

  return (
    <Styled.ButtonGroup >
      <Styled.NewButton
        variant={variant}
        type={type}
        disabled={disabled}
        onClick={onClick}
        $preset={preset}
      >
        {text}
      </Styled.NewButton>
    </Styled.ButtonGroup>
  );
};
