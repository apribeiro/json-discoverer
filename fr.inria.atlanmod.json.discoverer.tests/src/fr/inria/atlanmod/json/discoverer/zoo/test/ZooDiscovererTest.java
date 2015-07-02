/*******************************************************************************
 * Copyright (c) 2008, 2013
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (javier.canovas@inria.fr) 
 *******************************************************************************/

package fr.inria.atlanmod.json.discoverer.zoo.test;

import java.io.File;

import fr.inria.atlanmod.json.discoverer.zoo.ModelDrawer;
import fr.inria.atlanmod.json.discoverer.zoo.ZooDiscoverer;

public class ZooDiscovererTest {
	public static void main(String[] args) {
		ZooDiscoverer zooDiscoverer = new ZooDiscoverer(new File("../fr.inria.atlanmod.json.discoverer.zoo/zoo"));
		zooDiscoverer.discover(true);
		
		ModelDrawer drawer = new ModelDrawer( 
			new File("../fr.inria.atlanmod.json.discoverer.zoo/"),
			new File("../graphviz-2.38/bin/dot.exe"));
		drawer.traverseAndDrawFolder(new File("../fr.inria.atlanmod.json.discoverer.zoo/zoo"), true);
	}
}
