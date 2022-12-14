package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mat")
public class MathController {
    @ApiOperation(value = "Benvenuto", notes = "Benvenuto sul controller")
    @GetMapping(value = "")
    public String welcomeMathMsg(){
        return "Benvenuto sul math controller!";
    }
    @ApiOperation(value = "divisione", notes = "prints the description of the operation: division")
    @GetMapping(value = "/divisione")
    public ArithmeticOperation divisione(){
        return new ArithmeticOperation("Divisione",2,"operazione di divisione",new String[]{"Invariantiva", "Distributiva"});
    }
    @ApiOperation(value = "moltiplicazione")
    @GetMapping(value = "/multiplication")
    public int multiplication(@ApiParam(value = "primo")@RequestParam(required = true) int p,@ApiParam(value = "secondo")@RequestParam(required = true) int s){
        return p * s;
    }
    @ApiOperation(value = "figura")
    @GetMapping(value = "/square/{n}")
    public int square(@ApiParam(value = "moltiplicazione numeri")@PathVariable(required = true) int n){
        return n*n;
    }
}