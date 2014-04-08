package it.skedenpio.cards;

public class CardFrancesco extends Card {

	public CardFrancesco() {
		super("Carta di Fra", "Mè gioca mè...guadagni 10 punti e 2 posizioni...Che altro vuoi?");
	}

	@Override
	public void execute() {
		super.goNext();
		super.goNext();
		super.gainPoits(10);

	}

}
