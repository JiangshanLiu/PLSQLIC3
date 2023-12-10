# PL/SQL I<sup>3</sup>DE

we introduce <strong>I<sup>3</sup>DE (Inconsistency Inspecting IDE)</strong> — an IDE plugin to inspect inconsistencies
in PL/SQL code. We first observed the potential issues, e.g., misuses or bugs, that are introduced by the inconsistent
understanding of PL/SQL semantics by PL/SQL programmers and DBMS developers, and propose a metamorphic testing-based
approach for inspecting such inconsistencies in PL/SQL code. We design and implement our approach in I<sup>3</sup>DE, a
widely usable plugin for the IntelliJ Platform. We conducted a comparative user study involving 16 participants, and the
findings indicate that I<sup>3</sup>DE is consistently effective and efficient in helping programmers identify and avoid
inconsistencies across different programming difficulties.

Snapshots of I<sup>3</sup>DE static mode (left) and dynamic mode (right).

![snapshots][3]

For more details please see our [paper][1] and [technical report][2].

[1]: https://github.com/JiangshanLiu/PLSQLIC3/blob/master/web/I3DE%20An%20IDE%20for%20Inspecting%20Inconsistencies%20in%20PLSQL%20Code.pdf
[2]: https://jiangshanliu.github.io/PLSQLIC3/web/
[3]: https://github.com/JiangshanLiu/PLSQLIC3/blob/master/web/snapshots.png