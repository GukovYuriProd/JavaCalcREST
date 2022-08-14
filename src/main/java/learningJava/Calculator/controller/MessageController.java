package learningJava.Calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculate")
public class MessageController {

    @GetMapping
    public String list() {
        return "Введите два аргумента через ариф. знак (+-*:). Числа и арф знак разделяйте пробелом";
    }

    public Float _answer;
    public String response;
    @GetMapping("{expression}")
    public String getOne(@PathVariable String expression) {

        try {
            String[] _parts = expression.split(" ");
            switch (_parts[1]) {
                case "+":
                    _answer = Float.parseFloat(_parts[0]) + Float.parseFloat(_parts[2]);
                    break;
                case "-":
                    _answer = Float.parseFloat(_parts[0]) - Float.parseFloat(_parts[2]);
                    break;
                case "*":
                    _answer = Float.parseFloat(_parts[0]) * Float.parseFloat(_parts[2]);
                    break;
                case ":":
                    _answer = Float.parseFloat(_parts[0]) / Float.parseFloat(_parts[2]);
                    break;
            }
            if (_answer != null) {response = expression + " = " + _answer; _answer = null;} else response = "Ты чмо ебаное пиши нормально";
        } catch (RuntimeException e) {
            response = "Ты чмо ебаное пиши нормально";
        }
        return response;
    }
}