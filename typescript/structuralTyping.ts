interface Printable { print(): void }

class Report { print () { console.log("report"); }}
const p: Printable = new Report();
p.print()