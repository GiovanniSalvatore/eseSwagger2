package co.develhope.swagger2.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {
    @ApiModelProperty(value = "nome operazione", example = "addition")
    private String name;
    @ApiModelProperty(value = "numero min operatori", example = "2")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "descrizione", example = "somma")
    private String description;
    @ApiModelProperty(value = "proprietà operazione", example = "commutativa")
    private String[] properties;
}
