# Avoid annotation bug for groovy

'short' does not works on some groovy version.

you can use this library `reportman-annotation-alter` instead of `reportman-annotation` until groovy can set short value to annotation.

### Defining as an already defined variable
- It works on Groovy between 2.1.3 and 2.5.3 (tested by 2.1.3 / 2.4.13 / 2.5.3)
- But, It does not works since Groovy 2.5.4. (tested by 2.5.4 / 2.5.14 / 3.0.8)

