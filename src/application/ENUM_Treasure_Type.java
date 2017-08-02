package application;

public enum ENUM_Treasure_Type {

	// Treasure is measured in milligrams (1/1000th gram), centigrams (1/100th gram), decigrams (1/10th gram), grams, 
	// decagrams (10 grams), centagrams (100 grams), kilograms (1000 grams), and tons (1000 kilograms).
	// Every Freehold, God-City, and geographical area has multipliers on each type. 
	// These multipliers are applied when a character tries to sell or trade their stuff at a market.
	// Since barter is the preferred system of trade, after multipliers are factored into the values of
	// what is being sold and what is being bought, they must have equal values in order for the trade to be completed.
	
	SALVAGE_MATERIAL_COMMON,	// BROKEN LARGE FORMED PARTS, i.e. support struts, broken armor, broken weapons
	SALVAGE_MATERIAL_RARE,		// BROKEN SMALL FORMED PARTS, i.e. circuit traces, ball bearings, brushes
	SALVAGE_MATERIAL_EXOTIC, 	// BROKEN DELICATE FORMED PARTS, i.e. transistors, inductors, chips
	SALVAGE_PART_COMMON,		// INTACT LARGE FORMED PARTS, i.e. armor, weapons, limbs 
	SALVAGE_PART_RARE,			// INTACT SMALL FORMED PARTS, i.e. motors, mechanical parts, actuators 
	SALVAGE_PART_EXOTIC,		// INTACT DELICATE FORMED PARTS, i.e. servos, complex parts 
	SCRAP_CODE_COMMON,			// UNCORRUPTED COMMON CODE, i.e. input/output blocks, common drivers 
	SCRAP_CODE_RARE,			// UNCORRUPTED CUSTOM CODE, i.e. module drivers, specialized code 
	SCRAP_CODE_EXOTIC,			// UNCORRUPTED OLD CODE, i.e. databases,  
	MINERAL_COMMON,				// MASS OF COMMON MINERALS, i.e. carbon, iron, etc. 
	MINERAL_RARE,				// MASS OF RARE MINERALS, i.e. aluminum, mercury, etc. 
	MINERAL_EXOTIC,				// MASS OF SUPER-RARE MINERALS, i.e. gold, silver, plutonium, etc. 
	BLUEPRINT_COMMON,			// BLUEPRINT OF COMMON ITEM, i.e. tools, furniture, simple machines, etc. 
	BLUEPRINT_RARE,				// BLUEPRINT OF ARMOR OR WEAPONS, i.e. armors, weapons, alchemical mixtures, etc. 
	BLUEPRINT_EXOTIC,			// BLUEPRINT OF SPECIALIST TOOLS, i.e. siege weapons, siege armors, rare-scale machines, etc.
	CIRCUIT_COMMON,				// LARGELY INTACT COMMONLY USED CIRCUIT, i.e.  
	CIRCUIT_RARE,				// LARGELY INTACT DIFFICULT TO BUILD CIRCUIT, i.e. 
	CIRCUIT_EXOTIC,				// LARGELY INTACT UNIQUE OR RARELY FOUND CIRCUIT, i.e. 
	FOOD_COMMON,				// EASILY FOUND TYPE OF FOOD, i.e. domestic crops, domestic livestock, etc.
	FOOD_RARE, 					// UNCOMMON FOOD OR PREPARED FOODSTUFFS, i.e. wild game, foraged vegetables, rations, etc.
	FOOD_EXOTIC,				// UNKNOWN OR NEW FOODSTUFFS, i.e. organic foods, fish, high-density polymers, etc.
}
