import numpy as np
import matplotlib.pyplot as plt
import random
from collections import defaultdict


def d(x, y):
    return ((x[0]-y[0])**2 + (x[1]-y[1])**2)**(1/2)


def compute_clusters():
    clusters = defaultdict(list)
    # key is the center
    # values are points that belong to that center
    for p in points:
        indx = -1
        minD = float('inf')
        for i, c in enumerate(centres):
            curr = d(p, c)
            if curr < minD:
                indx = i
                minD = curr
        clusters[centres[indx]].append(p)

    return clusters


def compute_centres():
    new_centres = []
    for centre in centres:
        cluster_points = clusters[centre]
        minD = float('inf')
        new_centre = centre
        for p in cluster_points:
            total_dist = 0
            for q in cluster_points:
                total_dist += d(p, q)
            if total_dist < minD:
                new_centre = p
                minD = total_dist
        new_centres.append(new_centre)
    return new_centres  # returning list of centres


k = 4
n = 100
points = np.random.rand(n, 2)
plt.scatter(points[:, 0], points[:, 1])
points = [(x[0], x[1]) for x in points]
plt.show()
centres = random.choices(points, k=k)  # this is a list
clusters = compute_clusters()

for i in range(100):
    new_centres = compute_centres()
    if new_centres == centres:
        break
    centres = new_centres
    clusters = compute_clusters()

colors = ['g', 'r', 'm', 'y']

cluster_colors = dict()
indx = 0
for centre in centres:
    cluster_colors[centre] = colors[indx]
    indx += 1

plt.figure()
for centre in centres:
    for p in clusters[centre]:
        if p in centres:
            color = 'k'
        else:
            color = cluster_colors[centre]
        plt.scatter(p[0], p[1], color=color)
plt.show()
