package map;

public class Testklasse {

	
	

	public static void main(String[] args) throws Exception {
		
		AufbauMap.ALL[0].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[1])};
		//Verbindungen festlegen von Knoten zu Knoten
		
		AufbauMap.ALL[1].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[2]), new Edge(AufbauMap.ALL[0])};
		AufbauMap.ALL[2].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[3]), new Edge(AufbauMap.ALL[1])};
		AufbauMap.ALL[3].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[4]), new Edge(AufbauMap.ALL[2])};
		AufbauMap.ALL[4].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[5]), new Edge(AufbauMap.ALL[3])};
		AufbauMap.ALL[5].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[6]), new Edge(AufbauMap.ALL[4])};
		AufbauMap.ALL[6].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[7]), new Edge(AufbauMap.ALL[5])};
		AufbauMap.ALL[7].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[8]), new Edge(AufbauMap.ALL[6])};
		AufbauMap.ALL[8].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[9]), new Edge(AufbauMap.ALL[7])};
		AufbauMap.ALL[9].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[10]), new Edge(AufbauMap.ALL[8])};
		AufbauMap.ALL[10].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[11]), new Edge(AufbauMap.ALL[9])};
		AufbauMap.ALL[11].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[12]), new Edge(AufbauMap.ALL[10])};
		AufbauMap.ALL[12].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[13]), new Edge(AufbauMap.ALL[11])};
		AufbauMap.ALL[13].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[14]), new Edge(AufbauMap.ALL[12])};
		AufbauMap.ALL[14].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[15]), new Edge(AufbauMap.ALL[13])};
		AufbauMap.ALL[15].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[16]), new Edge(AufbauMap.ALL[14])};
		AufbauMap.ALL[16].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[17]), new Edge(AufbauMap.ALL[15])};
		AufbauMap.ALL[17].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[18]), new Edge(AufbauMap.ALL[16])};
		AufbauMap.ALL[18].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[19]), new Edge(AufbauMap.ALL[17])};
		AufbauMap.ALL[19].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[20]), new Edge(AufbauMap.ALL[18])};
		AufbauMap.ALL[20].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[21]), new Edge(AufbauMap.ALL[19])};
		AufbauMap.ALL[21].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[22]), new Edge(AufbauMap.ALL[20])};
		AufbauMap.ALL[22].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[23]), new Edge(AufbauMap.ALL[21])};
		AufbauMap.ALL[23].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[27]),new Edge(AufbauMap.ALL[24]), new Edge(AufbauMap.ALL[22])};
		AufbauMap.ALL[24].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[25]), new Edge(AufbauMap.ALL[23])};
		AufbauMap.ALL[25].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[26]), new Edge(AufbauMap.ALL[24])};
		AufbauMap.ALL[26].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[41]),new Edge(AufbauMap.ALL[38]),new Edge(AufbauMap.ALL[35]), new Edge(AufbauMap.ALL[25])};
		AufbauMap.ALL[27].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[28]), new Edge(AufbauMap.ALL[23])};
		AufbauMap.ALL[28].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[29]), new Edge(AufbauMap.ALL[27])};
		AufbauMap.ALL[29].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[30]), new Edge(AufbauMap.ALL[28])};
		AufbauMap.ALL[30].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[31]), new Edge(AufbauMap.ALL[29])};
		AufbauMap.ALL[31].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[32]), new Edge(AufbauMap.ALL[30])};
		AufbauMap.ALL[32].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[33]), new Edge(AufbauMap.ALL[31])};
		AufbauMap.ALL[33].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[34]), new Edge(AufbauMap.ALL[32])};
		AufbauMap.ALL[34].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[67]), new Edge(AufbauMap.ALL[33])};
		AufbauMap.ALL[35].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[36]), new Edge(AufbauMap.ALL[26])};
		AufbauMap.ALL[36].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[37]), new Edge(AufbauMap.ALL[35])};
		AufbauMap.ALL[37].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[34]), new Edge(AufbauMap.ALL[36])};
		AufbauMap.ALL[38].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[39]), new Edge(AufbauMap.ALL[37])};
		AufbauMap.ALL[39].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[40]), new Edge(AufbauMap.ALL[38])};
		AufbauMap.ALL[40].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[59]), new Edge(AufbauMap.ALL[39])};
		AufbauMap.ALL[41].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[42]), new Edge(AufbauMap.ALL[26])};
		AufbauMap.ALL[42].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[43]), new Edge(AufbauMap.ALL[41])};
		AufbauMap.ALL[43].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[44]), new Edge(AufbauMap.ALL[42])};
		AufbauMap.ALL[44].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[45]), new Edge(AufbauMap.ALL[43])};
		AufbauMap.ALL[45].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[46]), new Edge(AufbauMap.ALL[44])};
		AufbauMap.ALL[46].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[47]), new Edge(AufbauMap.ALL[45])};
		AufbauMap.ALL[47].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[48]), new Edge(AufbauMap.ALL[46])};
		AufbauMap.ALL[48].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[49]), new Edge(AufbauMap.ALL[47])};
		AufbauMap.ALL[49].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[50]), new Edge(AufbauMap.ALL[48])};
		AufbauMap.ALL[50].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[51]), new Edge(AufbauMap.ALL[49])};
		
		AufbauMap.ALL[51].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[74]), new Edge(AufbauMap.ALL[52]),new Edge(AufbauMap.ALL[51])};
		AufbauMap.ALL[52].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[54]), new Edge(AufbauMap.ALL[52])};
		AufbauMap.ALL[53].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[55]), new Edge(AufbauMap.ALL[53])};
		AufbauMap.ALL[54].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[56]), new Edge(AufbauMap.ALL[54])};
		AufbauMap.ALL[55].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[57]), new Edge(AufbauMap.ALL[55])};
		AufbauMap.ALL[56].adjacencies = new Edge[] {new Edge(AufbauMap.ALL[58]), new Edge(AufbauMap.ALL[56])};
		AufbauMap.ALL[57].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[57])};
		AufbauMap.ALL[58].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[40]),new Edge(AufbauMap.ALL[60]),new Edge(AufbauMap.ALL[64])};
		AufbauMap.ALL[59].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[61]), new Edge(AufbauMap.ALL[59])};
		AufbauMap.ALL[60].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[60]), new Edge(AufbauMap.ALL[62])};
		AufbauMap.ALL[61].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[65]), new Edge(AufbauMap.ALL[61]), new Edge(AufbauMap.ALL[63])};
		AufbauMap.ALL[62].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[64]),new Edge(AufbauMap.ALL[62])};
		AufbauMap.ALL[63].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[59]), new Edge(AufbauMap.ALL[63])};
		AufbauMap.ALL[64].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[68]), new Edge(AufbauMap.ALL[62]), new Edge(AufbauMap.ALL[66])};
		AufbauMap.ALL[65].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[67]), new Edge(AufbauMap.ALL[65])};
		AufbauMap.ALL[66].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[34]), new Edge(AufbauMap.ALL[66])};
		AufbauMap.ALL[67].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[69]), new Edge(AufbauMap.ALL[65])};
		AufbauMap.ALL[68].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[70]), new Edge(AufbauMap.ALL[68])};
		AufbauMap.ALL[69].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[71]), new Edge(AufbauMap.ALL[69])};
		AufbauMap.ALL[70].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[72]), new Edge(AufbauMap.ALL[70])};
		AufbauMap.ALL[71].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[73]), new Edge(AufbauMap.ALL[71])};
		AufbauMap.ALL[72].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[74]), new Edge(AufbauMap.ALL[72])};
		AufbauMap.ALL[73].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[74]), new Edge(AufbauMap.ALL[73])};
		AufbauMap.ALL[74].adjacencies = new Edge[] { new Edge(AufbauMap.ALL[52]), new Edge(AufbauMap.ALL[74])};
		
		
		//Window als Startpunkt für die komplette Anwendung

		Window window = new Window();
        }
}



