## Домашние задания

### 1. Система счисления

```
Вычислить значение выражения "столбиком" в двоичной системе счисления:

121(10) - 68(10)

По аналогии с уроком. Решение описать текстом и прикрепить.
```
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1) Переводим число 121 с 10-ой системы счисления в двоичную, дополняем количество битов слева 0.

121|2 (1)  -> 01111001
 60|2 (0)
 30|2 (0)
 15|2 (1)
  7|2 (1)
  3|2 (1)
  1

2) Переводим число 68 (положительное) с 10-ой системы счисления в двоичную, дополняем количество битов слева 0. Так как перед числом 68 знак минус, переводим его прямой
	двоичный кода в обратный и далее в дополнительный код (+1 к младшему разряду).

68|2 (0)   -> 01000100 -> 10111011 -> 10111100
34|2 (0)
17|2 (1)
 8|2 (0)
 4|2 (0)
 2|2 (0)
 1

3) Суммируем два двоичных значения.
 	1111
 	01111001
 	10111100
  1|00110101

4) Переводим двоичное число в 10-ое.

76543210 <- index
00110101 -> 1*2^5 + 1*2^4 + 1*2^2 + 1*2^0 = 32 + 16 + 4 + 1 = 53