instructor(chan,math273).
instructor(patel,ee222).
instructor(grossman,cs301).
enrolled(kevin,math273).
enrolled(juana,ee222).
enrolled(juana,cs301).
enrolled(kiki,math273).
enrolled(kiko,cs301).
rating(chan, y).
rating(patel,n).
rating(grossman,y).
teaches(P,S) :- instructor(P,C) , enrolled(S,C).
acceptable(N) :- rating(N,y).
