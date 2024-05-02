# Actividad1-Testing

1. Explica el siguiente gráfico en términos de SUT y DOC para pruebas unitarias

![image](/images/Untitled.png)

El gráfico proporcionado ilustra la interacción entre una clase de prueba, el sistema bajo prueba (SUT) y los objetos colaboradores dependientes (DOC) en el contexto de pruebas unitarias.
Interacciones:

- Inputs directos: Datos o llamadas de método que la clase de prueba envía al SUT.
- Outputs directos: Respuestas del SUT a la clase de prueba.
2. Imaginemos algún servicio financiero (clase FinancialService) que, en función del último pago del cliente y su tipo (cualquiera que sea), calcula algún "bonus".

```java
public class FinancialService {
.... // definition of fields and other methods omitted
public BigDecimal calculateBonus(long clientId, BigDecimal payment) {
Short clientType = clientDAO.getClientType(clientId);
BigDecimal bonus = calculator.calculateBonus(clientType, payment);
clientDAO.saveBonusHistory(clientId, bonus);
return bonus;
 }
}
```

Identifica el SUT y sus colaboradores (DOC) y describe los tipos de interacción que ocurren
dentro del método calculateBonus() importantes para la prueba.

El **SUT** en este escenario es el método **`calculateBonus()`** dentro de la clase **`FinancialService`**. Este método es responsable de calcular un bonus basado en el último pago y el tipo de cliente.

Para el método **`calculateBonus()`**, los **DOC** identificables son:

- **`clientDAO`**: Interactúa con la base de datos para obtener y almacenar información del cliente.
- **`calculator`**: Un componente utilizado para calcular el valor del bonus basado en el tipo de cliente y el pago.

Intput indirecto : **`clientDAO.getClientType(clientId)`**

Output indirecto : **`calculator.calculateBonus(clientType, payment)`,`clientDAO.saveBonusHistory(clientId, bonus)`**

3. Sea la abstracción POO siguiente: 

![Untitled](images/Untitled%201.png)

### **Razones para Preocuparse por Interacciones Indirectas**

1. **Impacto en el Cliente**: Las interacciones indirectas, aunque no involucran contacto directo con el cliente, pueden afectar significativamente la calidad del servicio o producto final entregado al cliente.
2. **Efecto Cascada**: Un error en un nivel inferior puede propagarse a través de las interacciones indirectas y magnificar problemas en niveles superiores.
3. **Dependencias Ocultas**: Las interacciones indirectas a menudo revelan dependencias no evidentes entre componentes o roles, que pueden ser críticas para la estabilidad y eficiencia del sistema.