def fibbonaciSeq(n):
    if n <= 2:
        return n
    else:
        recurs = fibbonaciSeq(n-1) + fibbonaciSeq(n-2)
        return recurs

print(fibbonaciSeq(5))






