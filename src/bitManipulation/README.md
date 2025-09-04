# learn these 2 questions
1. Fast exponentiation
2. Modular Exponentiation -> a^n % x




# Bit Manipulation Cheatsheet 🧮

Bit manipulation works at the binary level. Here are all the common operators, their meaning, and truth tables.


## 1. Bitwise AND `&`
- **Rule:** `1 & 1 = 1`, else `0`
- **Use:** Masking bits (keep selected bits only).

| A | B | A & B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   0   |
| 1 | 0 |   0   |
| 1 | 1 |   1   |


## 2. Bitwise OR `|`
- **Rule:** `1 | 1 = 1`, `1 | 0 = 1`, else `0`
- **Use:** Setting bits (force a bit to 1).

| A | B | A \| B |
|---|---|--------|
| 0 | 0 |   0    |
| 0 | 1 |   1    |
| 1 | 0 |   1    |
| 1 | 1 |   1    |


## 3. Bitwise XOR `^`
- **Rule:** `1 ^ 1 = 0`, `0 ^ 0 = 0`, else `1`
- **Use:** Toggling bits, finding odd-one-out.

| A | B | A ^ B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   1   |
| 1 | 0 |   1   |
| 1 | 1 |   0   |


## 4. Bitwise NOT `~`
- **Rule:** Flips every bit (`0 → 1`, `1 → 0`)
- **Use:** One’s complement (in 2’s complement machines, `~x = -(x+1)`).

Example (8-bit view):

x  =  00000110 (6)
~x =  11111001 (-7 in signed 8-bit)

## 5. Left Shift `<<`
- **Rule:** Shift bits left, fill right with `0`.
- **Effect:** Multiply by `2^n`.
```
3 << 1 = 6    (00000011 << 1 = 00000110)


## 6. Right Shift `>>`
- **Rule:** Shift bits right, sign bit preserved.  
- **Effect:** Divide by `2^n` (floor for positives).  
```
6 >> 1 = 3    (00000110 >> 1 = 00000011)
-6 >> 1 = -3
```

---

## 7. Unsigned Right Shift `>>>` (Java / JS only)
- **Rule:** Shift right, fill left with `0` (ignores sign).  
```
-6 >>> 1  = large positive (depends on bit width)
```

---

## Bonus: Compound Assignment Operators
- `&=` , `|=` , `^=` , `<<=` , `>>=` , `>>>=`  
These are shorthand versions (e.g. `a &= b` → `a = a & b`).

---

## Quick Reference
- **Masking bits:** `x & mask`
- **Set a bit:** `x | (1 << k)`
- **Clear a bit:** `x & ~(1 << k)`
- **Toggle a bit:** `x ^ (1 << k)`
- **Check a bit:** `(x >> k) & 1`
- **Is power of 2:** `x & (x - 1) == 0`
