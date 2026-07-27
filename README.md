# IT10.3

Java coursework for Grade 10 IT Term 3. These small NetBeans projects practise conditional statements with user input from `JOptionPane`.

## Projects

| Project | What it does |
| --- | --- |
| [`JavaApplication3`](./JavaApplication3) | Checks a driver's age and prints a licence-related message. |
| [`OddOrEven`](./OddOrEven) | Uses the remainder operator to decide whether an integer is odd or even. |
| [`OutputMonthName`](./OutputMonthName) | Converts a number from 1 to 12 into a month name and handles invalid input. |
| [`TemperatureReview`](./TemperatureReview) | Places a temperature into a range from freezing to hot. |
| [`ThinkPositive`](./ThinkPositive) | Identifies whether a number is positive, negative, or zero. |
| [`TicketDiscount`](./TicketDiscount) | Selects a ticket price according to the customer's age. |
| [`Vegetarian`](./Vegetarian) | Responds to a simple vegetarian meal choice. |

Each folder is a separate NetBeans project with its own `build.xml` and main class.

## Topics covered

- `if`, `else if`, and `else`
- Comparison and remainder operators
- Numeric ranges
- Integer, decimal, and character input
- Basic input validation
- Console output

## Running a project

Open one project folder in NetBeans and run its main class.

The projects use Java 26 in their NetBeans settings. If Apache Ant and JDK 26 are installed, you can also run a project from its folder:

```bash
ant run
```

For example:

```bash
cd OddOrEven
ant run
```

## License

This coursework is available under the [MIT License](./LICENSE).

