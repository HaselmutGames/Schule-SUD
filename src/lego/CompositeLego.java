package lego;

import java.util.ArrayList;
import java.util.List;

public class CompositeLego implements ILegoComponent {
	private List<ILegoComponent> components = new ArrayList<>();

	public void addComponent(ILegoComponent component) {
		components.add(component);
	}

	@Override
	public double calculatePrice() {
		return components.stream().mapToDouble(ILegoComponent::calculatePrice).sum();
	}

}