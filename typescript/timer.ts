class Timer {
    ticks = 0;
    start() { setInterval(this.tick, 1000); }
    tick() { this.ticks++; }
}