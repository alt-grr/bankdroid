package bankdroid.smskey.bank;

class Banks_HU extends AbstractBanks
{
	@Override
	public void init()
	{
		addBank(new Bank(-1, "AXA Bank", -1, // id, bankName, expiry
				new String[] { "AXA BANK", "AXA" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "iBanq2 .* k.ddal[^:]*[: ]+([0-9]+) .*"),// transactionSigning, regexp
						new Expression(true, "[^i][^:]+k.ddal[^:]+[: ]+([0-9]+)[^\\d]+AXA.*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Allianz Bank", -1, // id, bankName, expiry
				new String[] { "+36303444664" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "Az [^:]*: ([0-9]*).* Netbank .*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Budapest Bank", -1, // id, bankName, expiry
				new String[] { "+36309266245" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "[^:]+k.dja[^:]*: ([0-9]+) .+Kapcsolat.+") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Citibank", -1, // id, bankName, expiry
				new String[] { "+36303444455", "36303444455", "+36707060444", "+48226922484", "0048226922484" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(true, "[^:]*kod[: ]+([0-9]*).*citibank.*"), // transactionSigning, regexp
						new Expression(false, ".*jelsz.[: ]+([0-9]+).*Citibank.*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "ERSTE Bank", -1, // id, bankName, expiry
				new String[] { "+36303444481", "0036303444481", "+36707060177", "+36209000741" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, ".* ERSTE NetBank [^:]*: ([0-9]+)"),// transactionSigning, regexp
						new Expression(true, "ERSTE NetBank [^:]*: *[0-9]+-([0-9]+)") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "ERSTE Broker", -1, // id, bankName, expiry
				new String[] { "+36303444481", "0036303444481", "+36707060177", "+36209000741" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "^([a-zA-Z0-9]{4})$"),// transactionSigning, regexp
						new Expression(false, "^([a-zA-Z0-9]{4}) .*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "FHB Bank", -1, // id, bankName, expiry
				new String[] { "+36303444043", "+36209000889" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "[^:]*: ([0-9]*-[0-9]*).* FHB") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "K&H Bank", 1800, // id, bankName, expiry
				new String[] { "+36209000703", "06709000542", "+36709000542", "+36302030000" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, ".*K.H e-bank[^:]* jelszava: ([a-zA-Z0-9]+)[^:]*"),// transactionSigning, regexp
						new Expression(true, ".*K.H e-bank.* jelsz.: ([a-zA-Z0-9]+)[^:]*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "MKB Bank", -1, // id, bankName, expiry
				new String[] { "+36707060652", "+36209000652", "5833" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(true, ".*jelsz[^:]+[: ]*([0-9a-zA-Z]+)") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "MasterCard", -1, // id, bankName, expiry
				new String[] { "+36303444045" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, ".* code[: ]+([0-9]+).*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "NAV", 300, // id, bankName, expiry
				new String[] { "+36303444412" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, ".* k.dja[: ]+([0-9]+).*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "OTP Bank", 3600, // id, bankName, expiry
				new String[] { "+36309400700", "+36209400700", "06709400700" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(true, "OTPdirekt - [^:]*: ([0-9]*)") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Raiffeisen Bank", 3600, // id, bankName, expiry
				new String[] { "+36707060660", "+36209000848", "+36303444540" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, ".* Raiffeisen DirektNet .* jelszava: ([0-9]*) .*"),// transactionSigning, regexp
						new Expression(false, ".* password[is :]+([0-9]+).*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Szigetvári Takarék", -1, // id, bankName, expiry
				new String[] { "3444522" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "[^:]*k.d[: ]+[0-9]+-([0-9]+)") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Takarékszövetkezet", -1, // id, bankName, expiry
				new String[] { "+36709000666", "3444525", "06709000666", "+36303444717" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(true, ".* jelsz.*[: ]+([0-9a-zA-Z]+)"), // transactionSigning, regexp
						new Expression(false, "[^:]*k.d[: ]+[0-9]+-([0-9]+)") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Unicredit Bank", -1, // id, bankName, expiry
				new String[] { "+36303444504", "36303444504" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "[^:]* SpectraNet [^:]*: ([0-9A-Z]*)"),// transactionSigning, regexp
						new Expression(false, "SpectraNet [^:]*: ([0-9 -]*)") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Viber", -1, // id, bankName, expiry
				new String[] { "Viber" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, ".* code[^:]*[: ]+([0-9]+).*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Vodafone", -1, // id, bankName, expiry
				new String[] { "Vodafone" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, "[^:]*: ([0-9]+).*") // transactionSigning, regexp
				}, "HU")); // country

		addBank(new Bank(-1, "Webkincstár", 600, // id, bankName, expiry
				new String[] { "+36303444680" }, // phoneNumbers
				new Expression[] {// expressions
				new Expression(false, ".+SMSk.d ([0-9]+).*") // transactionSigning, regexp
				}, "HU")); // country

	}
}
