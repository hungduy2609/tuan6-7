from fractions import Fraction

def P(event,space):
	return Fraction(len(event&space),len(space))

space={'BB','BG','GB','GG'}
B={s for s in space if 'B' in s}
A_B={s for s in B if 'BB' in s}

P_B=P(B,space)
P_A_B=P(A_B,space)
P_A_with_B=P_A_B/P_B
print(P_A_with_B)