def hanoi(n, fr="1", to="2", spare="3"):
    """
    Move n disks from tower 'fr' to tower 'to'. 
    """
    moves = []
    helper(n, fr, to, spare, moves)
    return moves


def helper(n, fr, to, spare, moves):
    if n == 1:
        print(f"move disk on {fr} to {to}")
        moves.append(f"{fr} -> {to}")
    
    else:
        helper(n-1, fr, spare, to, moves)
        helper(1, fr, to, spare, moves)
        helper(n-1, spare, to, fr, moves)


def merge_sort(A):
    """
    Sort list A into order, and return result as a new list.
    """
    n = len(A)
    if n == 1: 
        return A
    mid = n // 2     # floor division
    L = merge_sort(A[:mid]) # T(n/2)
    R = merge_sort(A[mid:]) # T(n/2)
    return merge(L,R) # O(n)  Total = 2T(n/2) + n - 1


def merge(L,R):
    """
    Given sorted lists L and R, returns sorted list with their merged elements.
    """
    i = 0
    j = 0
    answer = []
    while i<len(L) and j<len(R):
        if L[i]<R[j]:
            answer.append(L[i])
            i += 1
        else:
            answer.append(R[j])
            j += 1
    if i<len(L):
        answer.extend(L[i:])
    if j<len(R):
        answer.extend(R[j:])
    return answer

def fib(n):
  """
  Returns the n'th fibonacci number.
  """
  if n == 1:
    return 1
  if n == 2:
    return 1
  else:
    return fib(n-1) + fib(n-2)

#much faster
def memo_fib(n):
  d = {1: 1,
       2: 1}
  return memo_fib_recurrence(n, d)
  
def memo_fib_recurrence(n, d):
  if n in d:
    return d[n]
  else:
    nth = memo_fib(n-1, d) + memo_fib(n-2, d)
    d[n] = nth
    return nth



      