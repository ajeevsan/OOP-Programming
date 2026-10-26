abstract class DataExporter {
    export(): string {
        const rows = this.fetch();
        return this.format(rows);
    }
    protected abstract fetch(): unknown[];
    protected abstract format(rows: unknown[]): string;
}

class CsvExporter extends DataExporter {
    protected fetch() { return [{ a: 1 }]; }
    protected format(rows: unknown[]) { return "a\n1"; }
}