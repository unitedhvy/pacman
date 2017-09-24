public void AI(int i) {
			int randomMove = (int)(Math.random() * 100) + 1;
			int monsterY = monsterCoord[i] - monsterCoord[i] / 10 * 10;
			int monsterX = monsterCoord[i] / 10;
			int pacManY = pacWhichBox - pacWhichBox / 10 * 10;
			int pacManX = pacWhichBox / 10;
			int bleh = (int)(Math.random() * 2);
			if ((monsterX < pacManX) && (monsterY < pacManY)) {
				if (bleh == 0) bleh = 3;
			}	
			else if ((monsterX < pacManX) && (monsterY > pacManY)) {
				if (bleh == 1) bleh = 3;
			}	
			else if ((monsterX > pacManX) && (monsterY < pacManY)) {
				if (bleh == 0) bleh = 2;
			}
			else if ((monsterX > pacManX) && (monsterY > pacManY)) {
				if (bleh == 1) bleh = 2;
			}
			else if(monsterX < pacManX) bleh = 3;
			else if (monsterX > pacManX) bleh = 2;
			else if (monsterY < pacManY) bleh = 1;
			else if (monsterY > pacManY) bleh = 0;
			if (randomMove > 60) { if (randomMove > 80) {bleh = 4;} else {bleh = 5;}}
			switch (bleh) {
				case 0: randNum = 0; break; // go up
				case 1: randNum = 1; break; // go down
				case 2: randNum = 2; break; // go left
				case 3: randNum = 3; break; // go right
				case 4: randNum = 4; break; // don't move
				case 5: randNum = (int)(Math.random() * 4); break; // go a random direction
			}
		}
