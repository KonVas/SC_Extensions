/* Drony sound with noise and a low pass filter */

Drone1 {
	* ar {| freq = 220.0, decay = 30, cutoff = 3000, mul = 1 |
		var out = LPF.ar( Ringz.ar(WhiteNoise.ar(0.01), freq, decay, mul), cutoff);
		^out;
	}
}

