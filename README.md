# YoRPG_Coleks
This is our take on the classic RPG game genre! :octocat:
(Developers of this lovely game are Aleksandra K., Colin H., and Johnny W.)

*Players may choose from three exciting protagonists*:
1. *Wizard*
    * Hailing from the Order of Ender nested in the Northern snowy peaks, Wizards have increased health and a **pointy hat**. :sparkles:
    * Wizards have an increased HP from 125 --> 200.
2. *Tank*
    * Pure muscle and steel, this character has greatly increased health and strength. His bulk, however, slows down his attack rate.
    * Tanks have an increased HP from 125 --> 500, but a decreased attack rate from 0.4 --> 0.2
3. *Archer*
    * A cunning and elegant character adventuring from the eastern Emerald Plains, what the archer lacks in health she makes up with increased attack rate.
    * Archers have an increased HP from 125 --> 175 and an increased attackRate from 0.4 --> 0.6


*Players may encounter many terrifying monsters on their journey*:

1. *Slime*
   * Bouncing from the Forests of Piloticus, slimes are fragile creatures, generally friendly unless you insult their fashion choices.
   * Slimes boast a lowered defense from 40 --> 10.
2. *Kool Aid*
   * Flowing from the Rivers of Nebraskaid, KoolAids are almost indestrucable. Practically no attack can faze their liquid bodies. 
   * KoolAids possess a heightened defense from 40 --> 150.
3. *Orc*
   * Terrifying ethereal beings hailing from the dank swamps of the Southern Delta, orcs are massive beasts, slow yet powerful.
   * Orcs have an increased HP from 150 --> 600, but a greatly reduced attack rate (1.0 --> 0.5).
4. *Troll*
   * Hailing from the caverns beneath the Western Plains, Trolls have superiour armour forged deep in their iron mines. 
   * Trolls have an increased defense from 20 --> 60.




Gameplay is simple and intuitive:

* Players first the difficulty of gameplay. This determines how easily a monster will be encountered. 
* They then choose their protagonist (from the above choices) and a worthy opponent (also from above choices), convinient about messages provide users with information regarding their selection. 
* The game then proceeds on a turn system. Once a monster is encountered, a fight begins 
* Successive attacks between player and monster are exchanged, and a player may opt to use their special attack, but in return be more vulnerable. The fight ends when either the player's or the monster's HP reaches 0.
* The game ends when either the player's HP reaches 0 (defeat), or 10 turns have elapsed (victory)

**Come join us on our noble quest and slay the beasts!.**


Developer Notes:

* Increase MAX_ENCOUNTERS to allow for longer games (especially on lower difficulty)
* Restructure Monster to be abstract, so all monsters are forced to poccess the about() method.
* Utilize about() to display class/monster info when user makes a selection
* Add Monster-type selection
* Change the attack() funtionality to include an element of randomness
