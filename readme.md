# State Pattern

## Introdução

O padrão State é uma técnica de design que visa melhorar a flexibilidade e a manutenção do código, especialmente quando um objeto pode se encontrar em diferentes estados e precisa alterar seu comportamento com base nesses estados. Para ilustrar melhor, vou dar o exemplo de uma Máquina de Café virtual.

## Contexto (Máquina de Café)

Definimos a máquina de café como nosso contexto. A máquina pode assumir estados como "Sem Moeda", "Moeda Inserida" e "Fazendo Café".

### Estados

#### Sem Moeda

- Responsável por exibir a mensagem "Insira uma moeda" quando o usuário tenta obter café sem inserir moeda.

#### Moeda Inserida

- Encarregado de responder quando o usuário pressiona o botão de café após inserir moeda, exibindo "Café Sendo Preparado".

#### Fazendo Café

- Lida com situações em que o usuário tenta inserir outra moeda, mostrando a mensagem "Café em Andamento, Aguarde".

## Transição de Estado

Implementamos transições de estado, por exemplo, de "Sem Moeda" para "Moeda Inserida" quando o usuário insere uma moeda. Outra transição ocorre de "Moeda Inserida" para "Fazendo Café" quando o usuário pressiona o botão de café.

## Benefícios do Padrão State

- Aumenta a modularidade e reusabilidade do código.
- Facilita a adição de novos estados sem modificar o código existente.

## Conclusão

Ao aplicar o padrão State em nossa máquina de café virtual, observamos uma melhoria significativa na organização do código e na facilidade de manutenção. A modularidade proporcionada pelo padrão permite que a máquina de café evolua de maneira flexível, incorporando novos estados ou ajustando comportamentos existentes conforme necessário.
