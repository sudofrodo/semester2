sing_a_song(anaya).
listens_to_music(rohit).
listens_to_music(anaya) :- sing_a_song(anaya).
happy(anaya) :- sing_a_song(anaya).
happy(rohit) :- listens_to_music(rohit).
playes_guitar(rohit) :- listens_to_music(rohit).
