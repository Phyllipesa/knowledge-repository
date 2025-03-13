package github.com.phyllipesa.dto;

/**
 * Vantagens do uso de record:
 *
 *   -  Menos código (sem necessidade de getters, setters e construtor).
 *   -  Imutabilidade (os valores não podem ser alterados depois da criação).
 *   -  Melhor compatibilidade com padrões modernos de DTO.
 *   -  Serialização automática (funciona normalmente com Jackson para JSON).
 *
 * Quando não usar record?
 *
 *   -  Se você precisar de validações dentro do DTO.
 *   -  Se precisar de métodos setters para alterar valores após a criação.
 *   -  Se houver necessidade de serialVersionUID (para compatibilidade de serialização em versões antigas de Java).
 */
public record PersonDtoWithRecord(Long id, String name, Long age) {}
